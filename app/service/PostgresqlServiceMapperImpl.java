package service;

import domain.Brand;
import mapper.BrandMapper;
import org.mybatis.guice.transactional.Isolation;
import org.mybatis.guice.transactional.Transactional;
import util.CustomException;

import javax.inject.Inject;
import java.util.List;

/**
 * use mybatis mapper interface easy link to Postgresql DB.
 * Created by howen on 15/10/23.
 */
@Transactional(isolation = Isolation.SERIALIZABLE, rethrowExceptionsAs= CustomException.class)
public class PostgresqlServiceMapperImpl implements PostgresqlService{

    @Inject
    private BrandMapper brandMapper;

    @Override
    public List<Brand> getAllBrand() {
        return brandMapper.getAllBrands();
    }
}
