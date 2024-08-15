package com.app.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpbPropertiesApplication {

    public static void main(String[] args) {
//        BinarySearchImpl binarySearch =
//                new BinarySearchImpl(new MergeSort());
//        ApplicationContext

        try(AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpbPropertiesApplication.class))
        {
            SomeExternalService someExternalService =
                    applicationContext.getBean(SomeExternalService.class);

            System.out.println(someExternalService.returnServiceUrl());
        }
    }

}
