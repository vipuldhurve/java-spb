package com.app.telusko.springNotBoot.service;

import org.springframework.stereotype.Component;

@Component
public class DesktopSpring implements ComputerSpring {

    public DesktopSpring() {
        System.out.println("DesktopSpring constructor!");
    }

    @Override
    public void compile() {
        System.out.println("Compiling the code with 404 bugs in DESKTOP");
    }
}
