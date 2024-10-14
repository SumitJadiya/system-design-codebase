package com.sumit.coding.design_patterns.behavioral.command.solution.resource;

public class Fan implements Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned off.");
    }
}
