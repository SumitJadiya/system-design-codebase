package com.sumit.coding.design_patterns.structural.bridge.solution.bridge.impl;

import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.Device;

public class TV implements Device {

    @Override
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("TV volume set to " + level);
    }
}
