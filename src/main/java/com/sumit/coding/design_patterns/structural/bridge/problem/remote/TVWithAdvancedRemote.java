package com.sumit.coding.design_patterns.structural.bridge.problem.remote;

public class TVWithAdvancedRemote {
    public void turnOn() {
        System.out.println("TV is turned ON with advanced remote.");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF with advanced remote.");
    }

    public void setVolume(int level) {
        System.out.println("TV volume set to " + level + " with advanced remote.");
    }

    public void mute() {
        System.out.println("TV is muted with advanced remote.");
    }
}
