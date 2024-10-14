package com.sumit.coding.design_patterns.behavioral.command.solution.resource;

public class TV implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("TV is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off.");
    }
}
