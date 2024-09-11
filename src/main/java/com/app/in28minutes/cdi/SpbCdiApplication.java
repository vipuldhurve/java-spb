package com.app.in28minutes.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpbCdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpbCdiApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpbCdiApplication.class, args);
//        Get SomeCdiBusiness bean from application context
        SomeCdiBusiness someCdiBusiness =
                applicationContext.getBean(SomeCdiBusiness.class);
//        Log the beans to check annotations
        LOGGER.info("{}  dao-{}", someCdiBusiness, someCdiBusiness.getSomeCdiDao());
    }
}
