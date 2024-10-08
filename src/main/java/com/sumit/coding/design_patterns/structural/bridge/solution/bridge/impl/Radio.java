package com.sumit.coding.design_patterns.structural.bridge.solution.bridge.impl;

import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.Device;

public class Radio implements Device {

    @Override
    public void turnOn() {
        System.out.println("Radio is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is turned OFF.");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Radio volume set to " + level);
    }
}
