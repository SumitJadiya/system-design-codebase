package com.sumit.coding.design_patterns.structural.bridge.solution.bridge.impl;

import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.Device;
import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.RemoteControl;

public class BasicRemoteControl extends RemoteControl {

    public BasicRemoteControl(Device device) {
        super(device);  // Pass the device to the superclass
    }

    @Override
    public void turnOn() {
        System.out.println("Basic Remote: Turn ON");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Basic Remote: Turn OFF");
        device.turnOff();
    }

    @Override
    public void volumeUp() {
        System.out.println("Basic Remote: Volume Up");
        device.setVolume(5);
    }

    @Override
    public void volumeDown() {
        System.out.println("Basic Remote: Volume Down");
        device.setVolume(2);
    }
}
