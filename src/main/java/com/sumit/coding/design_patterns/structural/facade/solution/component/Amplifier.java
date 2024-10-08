package com.sumit.coding.design_patterns.structural.facade.solution.component;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to: " + volume);
    }
}
