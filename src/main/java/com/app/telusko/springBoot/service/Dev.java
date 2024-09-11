package com.app.telusko.springBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    private Computer computer;
    public void build(){
        System.out.println("Working on some project!");
        computer.compile();
    }
}
