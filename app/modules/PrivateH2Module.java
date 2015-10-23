package modules;

import com.google.inject.PrivateModule;
import com.google.inject.name.Names;
import com.zaxxer.hikari.HikariDataSource;
import mapper.UserMapper;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import service.H2Service;
import service.H2ServiceMapperImpl;

import javax.inject.Provider;
import javax.inject.Singleton;
import javax.sql.DataSource;

/**
 * Private h2 db Module
 * Created by howen on 15/10/23.
 */
public class PrivateH2Module extends PrivateModule {
    @Override
    protected void configure() {
        install(new org.mybatis.guice.MyBatisModule() {
            @Override
            protected void initialize() {
                environmentId("default");
                bindConstant().annotatedWith(
                        Names.named("mybatis.configuration.failFast")).
                        to(true);
                bindDataSourceProviderType(HikariCPDataSourceProviderA.class);
                bindTransactionFactoryType(JdbcTransactionFactory.class);
                addMapperClass(UserMapper.class);
            }
        });

        bind(H2Service.class).annotatedWith(Names.named("ServiceH2")).to(H2ServiceMapperImpl.class);

        expose(H2Service.class).annotatedWith(Names.named("ServiceH2"));

        /***
         * if you use sqlsession you should bind Dao Class and expose them.
         */
//        bind(UserDao.class).to(UserDaoImpl.class);
//        bind(SqlSession.class).annotatedWith(Names.named("DbA")).toProvider(SqlSessionManagerProvider.class).in(Scopes.SINGLETON);


//        expose(UserDao.class);
//        expose(SqlSession.class).annotatedWith(Names.named("DbA"));
    }

    /* Provides a HikariCP DataSourceProvider. */
    @Singleton
    public static class HikariCPDataSourceProviderA implements Provider<DataSource> {
        private final HikariDataSource ds = new HikariDataSource();

        public HikariCPDataSourceProviderA() {
            this.ds.setJdbcUrl("jdbc:h2:file:./data;AUTO_SERVER=TRUE;IFEXISTS=TRUE;TRACE_LEVEL_FILE=0");
            this.ds.setUsername("play24-guice-mybatis");
            this.ds.setPassword("innoQ");
        }

        @Override
        public DataSource get() {
            return this.ds;
        }
    }

}
