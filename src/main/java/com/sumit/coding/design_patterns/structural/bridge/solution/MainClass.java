package com.sumit.coding.design_patterns.structural.bridge.solution;

import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.Device;
import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.RemoteControl;
import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.impl.AdvancedRemoteControl;
import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.impl.BasicRemoteControl;
import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.impl.Radio;
import com.sumit.coding.design_patterns.structural.bridge.solution.bridge.impl.TV;

public class MainClass {

    public static void main(String[] args) {
        // TV with basic remote
        Device tv = new TV();
        RemoteControl basicRemoteForTV = new BasicRemoteControl(tv);
        basicRemoteForTV.turnOn();
        basicRemoteForTV.volumeUp();
        basicRemoteForTV.turnOff();

        System.out.println("\n---\n");

        // Radio with advanced remote
        Device radio = new Radio();
        RemoteControl advancedRemoteForRadio = new AdvancedRemoteControl(radio);
        advancedRemoteForRadio.turnOn();
        advancedRemoteForRadio.volumeUp();
        advancedRemoteForRadio.turnOff();
    }
}

/*
*
* */
