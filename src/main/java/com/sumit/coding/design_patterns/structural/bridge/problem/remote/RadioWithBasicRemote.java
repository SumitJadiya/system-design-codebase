package com.sumit.coding.design_patterns.structural.bridge.problem.remote;

public class RadioWithBasicRemote {

    public void turnOn() {
        System.out.println("Radio is turned ON with basic remote.");
    }

    public void turnOff() {
        System.out.println("Radio is turned OFF with basic remote.");
    }

    public void setVolume(int level) {
        System.out.println("Radio volume set to " + level + " with basic remote.");
    }
}
