package com.sumit.coding.design_patterns.behavioral.command.solution.resource;

public class Light implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("Light is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off.");
    }
}
