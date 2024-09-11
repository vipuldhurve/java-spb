package com.app.telusko.springNotBoot;

import com.app.telusko.springNotBoot.service.DevSpring;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeluskoSpringApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        DevSpring devSpring =  context.getBean(DevSpring.class);
        DevSpring devSpring = (DevSpring) context.getBean("devSpring");
        System.out.println();
        devSpring.build();
    }
}
