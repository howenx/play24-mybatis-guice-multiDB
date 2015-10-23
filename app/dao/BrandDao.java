package dao;

import domain.Brand;

import java.util.List;

/**
 *
 * Created by howen on 15/10/23.
 */
public interface BrandDao {

    Brand getBrandsFromDao(Integer brandId);

    /**
     * get all brands.
     * @return List of Brand entity
     */
    List<Brand> getAllBrandsFromDao();
}
