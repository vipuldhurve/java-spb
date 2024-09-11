package com.app.telusko.springBoot.service;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Compiling the code with 404 bugs in DESKTOP");
    }
}
