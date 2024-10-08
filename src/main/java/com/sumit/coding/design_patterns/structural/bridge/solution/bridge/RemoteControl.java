package com.sumit.coding.design_patterns.structural.bridge.solution.bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class RemoteControl {

    protected Device device; // Bridge to the implementor (Device)

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void volumeUp();

    public abstract void volumeDown();
}
