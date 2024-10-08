package com.sumit.coding.design_patterns.structural.bridge.problem.remote;

public class RadioWithAdvancedRemote {

    public void turnOn() {
        System.out.println("Radio is turned ON with advanced remote.");
    }

    public void turnOff() {
        System.out.println("Radio is turned OFF with advanced remote.");
    }

    public void setVolume(int level) {
        System.out.println("Radio volume set to " + level + " with advanced remote.");
    }

    public void mute() {
        System.out.println("Radio is muted with advanced remote.");
    }
}
