package com.app.in28minutes.componentScan.inner;

import com.app.in28minutes.componentScan.ComponentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// To search for ComponentDao bean we need to ComponentScan the package explicitly
// As it is not in same package as SpbComponentScanApplication
// and also not present in the sub-packages(if any)
@ComponentScan("com.app.componentScan")
public class SpbComponentScanApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpbComponentScanApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpbComponentScanApplication.class, args);
//        Get ComponentDao bean
        ComponentDao componentDao =
                applicationContext.getBean(ComponentDao.class);
        LOGGER.info("{}", componentDao);
        LOGGER.info("{}", componentDao.getComponentJdbcConnection());
    }
}
