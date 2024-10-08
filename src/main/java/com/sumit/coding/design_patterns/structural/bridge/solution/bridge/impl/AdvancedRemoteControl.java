package com.sumit.coding.design_patterns.structural.bridge.solution.bridge.impl;

import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.Device;
import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.RemoteControl;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Advanced Remote: Turn ON");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Advanced Remote: Turn OFF");
        device.turnOff();
    }

    @Override
    public void volumeUp() {
        System.out.println("Advanced Remote: Volume Up with Voice Command");
        device.setVolume(10);
    }

    @Override
    public void volumeDown() {
        System.out.println("Advanced Remote: Volume Down with Voice Command");
        device.setVolume(1);
    }

    public void mute() {
        System.out.println("Advanced Remote: Muting the device");
        device.setVolume(0);
    }
}
