package com.app.telusko.springBoot.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{
    public void compile(){
        System.out.println("Compiling the code with 404 bugs in LAPTOP");
    }
}
