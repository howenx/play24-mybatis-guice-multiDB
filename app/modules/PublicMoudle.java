package modules;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;
import service.H2Service;
import service.H2ServiceMapperImpl;
import service.PostgresqlService;
import service.PostgresqlServiceMapperImpl;

/**
 *
 * Created by howen on 15/10/23.
 */
public class PublicMoudle implements Module {

//    @Override
//    protected void configure() {
//
//        bind(H2Service.class).annotatedWith(Names.named("ServiceH2")).to(H2ServiceMapperImpl.class);
////        expose(H2Service.class).annotatedWith(Names.named("ServiceH2"));
//        bind(PostgresqlService.class).to(PostgresqlServiceMapperImpl.class);
////        expose(PostgresqlService.class);
//    }

    @Override
    public void configure(Binder binder) {

    }
}
