package modules;

import com.google.inject.PrivateModule;
import com.google.inject.name.Names;
import com.zaxxer.hikari.HikariDataSource;
import mapper.BrandMapper;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import play.Logger;
import service.PostgresqlService;
import service.PostgresqlServiceMapperImpl;

import javax.inject.Provider;
import javax.sql.DataSource;

/**
 * Private h2 db Module
 * Created by howen on 15/10/23.
 */
public class PrivatePostgresqlModule extends PrivateModule {
    @Override
    protected void configure() {
        install(new org.mybatis.guice.MyBatisModule() {
            @Override
            protected void initialize() {
                environmentId("dev");
                bindConstant().annotatedWith(
                        Names.named("mybatis.configuration.failFast")).
                        to(true);
                bindDataSourceProviderType(HikariCPDataSourceProviderB.class);
                bindTransactionFactoryType(JdbcTransactionFactory.class);
                addMapperClass(BrandMapper.class);
            }
        });

        bind(PostgresqlService.class).to(PostgresqlServiceMapperImpl.class);

        expose(PostgresqlService.class);

        /***
         * if you use sqlsession you should bind Dao Class and expose them.
         */
//        bind(BrandDao.class).to(BrandDaoImpl.class);
//        bind(SqlSession.class).annotatedWith(Names.named("DbB")).toProvider(SqlSessionManagerProvider.class).in(Scopes.SINGLETON);


//        expose(BrandDao.class);
//        expose(SqlSession.class).annotatedWith(Names.named("DbB"));
    }

    /* Provides a HikariCP DataSourceProvider. */
//    @Singleton
    public static class HikariCPDataSourceProviderB implements Provider<DataSource> {
        private final HikariDataSource ds = new HikariDataSource();

        public HikariCPDataSourceProviderB() {
            this.ds.setJdbcUrl("jdbc:postgresql://172.28.3.17:5432/style");
            this.ds.setUsername("style");
            this.ds.setPassword("style@123");
        }

        @Override
        public DataSource get() {
            return this.ds;
        }
    }

}
