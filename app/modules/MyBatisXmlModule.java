package modules;



/**
 * Mybatis XML-Config.
 *
 * <p>
 *
 * @author Howen Xiong
 */

public class MyBatisXmlModule  extends  org.mybatis.guice.XMLMyBatisModule{
    @Override
    protected void initialize() {

        setEnvironmentId("development");
//        setClassPathResource("mybatis-config.xml");
    }
}
