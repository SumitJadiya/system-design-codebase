package com.sumit.coding.design_patterns.behavioral.command.problem.model;

public class RemoteControl {

    private String lastAction;  // Not ideal for storing complex actions

    public void pressLightOn(Light light) {
        light.turnOn();
        lastAction = "lightOn";
    }

    public void pressUndo(Light light, Fan fan) {
        if (lastAction.equals("lightOn")) {
            light.turnOff();  // Undo manually
        }
        // Handling undo for other devices and actions manually
    }

    // Handling undo for other devices and actions manually
    public void pressFanOn(Fan fan) {
        fan.turnOn();
    }

    public void pressTVOn(TV tv) {
        tv.turnOn();
    }

    // Similar methods for turning off appliances
}
