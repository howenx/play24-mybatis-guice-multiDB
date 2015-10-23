package dao;

import domain.Brand;
import org.apache.ibatis.session.SqlSession;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 *
 * Created by howen on 15/10/23.
 */
public class BrandDaoImpl implements BrandDao{

    @Inject
    @Named("DbB")
    private SqlSession sqlSession;

    @Override
    public Brand getBrandsFromDao(Integer brandId) {
        return sqlSession.selectOne("mapper.BrandMapper.getBrands",brandId);
    }

    @Override
    public List<Brand> getAllBrandsFromDao() {
        return sqlSession.selectList("mapper.BrandMapper.getAllBrands");
    }
}
