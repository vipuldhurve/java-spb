package com.app.telusko.springNotBoot.service;


public class DevSpring {

    private ComputerSpring computerSpring;

    public DevSpring() {
        System.out.println("DevSpring constructor!");
    }

    public DevSpring(ComputerSpring computerSpring) {
        this.computerSpring = computerSpring;
        System.out.println("DevSpring(1) constructor!");
    }

    public void build() {
        System.out.println("Working on some project!");
        computerSpring.compile();
    }

    public ComputerSpring getComputerSpring() {
        return computerSpring;
    }

    public void setComputerSpring(ComputerSpring computerSpring) {
        System.out.println("Setting computerString in devSpring");
        this.computerSpring = computerSpring;
    }
}
