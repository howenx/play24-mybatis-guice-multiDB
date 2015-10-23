package service;

import domain.Brand;

import java.util.List;

/**
 *
 * Created by howen on 15/10/23.
 */
public interface PostgresqlService {

    public List<Brand> getAllBrand();

}
