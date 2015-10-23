package controllers;

import play.mvc.*;

import service.H2Service;
import service.PostgresqlService;
import views.html.*;

import javax.inject.Inject;
import javax.inject.Named;

public class Application extends Controller {

    @Named("ServiceH2")
    @Inject
    private H2Service h2Service;

    @Inject
    private PostgresqlService postgresqlService;


    public Result listUsers() {
        return ok(users.render(h2Service.getAllUser()));
    }

    public Result listBrands() {
        return ok(brands.render(postgresqlService.getAllBrand()));
    }
}
