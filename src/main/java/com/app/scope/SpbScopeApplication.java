package com.app.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpbScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpbScopeApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpbScopeApplication.class, args);
//        Create two personDao : scope is singleton so same instance
        PersonDao personDao1 =
                applicationContext.getBean(PersonDao.class);
        PersonDao personDao2 =
                applicationContext.getBean(PersonDao.class);
//        Get the dependency(JDBCConnection) of scope prototype that is using a proxy
//        from the personDao bean
//        Different beans whenever you try to get dependency even with same bean
        LOGGER.info("{}", personDao1);
        LOGGER.info("{}", personDao1.getJdbcConnection());
        LOGGER.info("{}", personDao1.getJdbcConnection());

        LOGGER.info("{}", personDao2);
        LOGGER.info("{}", personDao2.getJdbcConnection());
    }

}
