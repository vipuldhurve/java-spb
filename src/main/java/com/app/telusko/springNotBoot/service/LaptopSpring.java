package com.app.telusko.springNotBoot.service;

public class LaptopSpring implements ComputerSpring {

    public LaptopSpring() {
        System.out.println("LaptopSpring constructor!");
    }

    public void compile() {
        System.out.println("Compiling the code with 404 bugs in LAPTOP");
    }

}
