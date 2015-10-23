package modules;

import com.google.inject.name.Names;
import mapper.BrandMapper;
import mapper.CateMapper;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.datasource.builtin.PooledDataSourceProvider;

import java.util.Properties;

public class MyBatisModule extends org.mybatis.guice.MyBatisModule {

    @Override
    protected void initialize() {
        environmentId("development");
        bindConstant().annotatedWith(
                Names.named("mybatis.configuration.failFast")).
                to(true);

        Properties  props = new Properties();
        props.setProperty("JDBC.driver", "org.postgresql.Driver");
        props.setProperty("JDBC.url", "jdbc:postgresql://172.28.3.17:5432/style");
        props.setProperty("JDBC.username", "style");
        props.setProperty("JDBC.password", "style@123");
        props.setProperty("JDBC.autoCommit", "false");

        bindDataSourceProviderType(PooledDataSourceProvider.class);
        bindTransactionFactoryType(JdbcTransactionFactory.class);

        addMapperClass(BrandMapper.class);
        addMapperClass(CateMapper.class);

        Names.bindProperties(binder(), props);
    }
}
