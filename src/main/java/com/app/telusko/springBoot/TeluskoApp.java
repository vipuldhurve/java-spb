package com.app.telusko.springBoot;

import com.app.telusko.springBoot.service.Dev;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TeluskoApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TeluskoApp.class);
        Dev dev = context.getBean(Dev.class);
        dev.build();
    }
}
