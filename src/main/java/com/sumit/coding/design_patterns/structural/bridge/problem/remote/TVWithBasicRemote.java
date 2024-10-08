package com.sumit.coding.design_patterns.structural.bridge.problem.remote;

public class TVWithBasicRemote {

    public void turnOn() {
        System.out.println("TV is turned ON with basic remote.");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF with basic remote.");
    }

    public void setVolume(int level) {
        System.out.println("TV volume set to " + level + " with basic remote.");
    }
}
