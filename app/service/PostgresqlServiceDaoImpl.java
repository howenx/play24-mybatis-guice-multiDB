package service;

import dao.BrandDao;
import domain.Brand;
import org.mybatis.guice.transactional.Transactional;
import util.CustomException;

import javax.inject.Inject;
import java.util.List;

/**
 * use sqlsession with postgresql db.
 * Created by howen on 15/10/23.
 */
@Transactional(rethrowExceptionsAs= CustomException.class)
public class PostgresqlServiceDaoImpl implements PostgresqlService{

    @Inject
    private BrandDao brandDao;

    @Override
    public List<Brand> getAllBrand() {
        return brandDao.getAllBrandsFromDao();
    }
}
