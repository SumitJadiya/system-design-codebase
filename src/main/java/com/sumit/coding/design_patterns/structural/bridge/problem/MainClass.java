package com.sumit.coding.design_patterns.structural.bridge.problem;

import com.sumit.coding.design_patterns.structural.bridge.problem.remote.TVWithAdvancedRemote;
import com.sumit.coding.design_patterns.structural.bridge.problem.remote.TVWithBasicRemote;

public class MainClass {
    public static void main(String[] args) {
        // Use BasicRemote with a TV
        TVWithBasicRemote basicRemote = new TVWithBasicRemote();
        basicRemote.turnOn();
        basicRemote.setVolume(50);
        basicRemote.turnOff();

        System.out.println();

        // Use Advanced Remote with a TV
        TVWithAdvancedRemote advancedRemote = new TVWithAdvancedRemote();
        advancedRemote.turnOn();
        advancedRemote.setVolume(50);
        advancedRemote.mute();
        advancedRemote.turnOff();
    }
}

/*
 * In this approach:
 *
 * • You are duplicating a lot of code across different classes (e.g., methods like turnOn, turnOff, and setVolume).
 * • For every combination of device and remote (TV + Basic Remote, TV + Advanced Remote, Radio + Basic Remote, etc.), you need to create a separate class. This becomes unmanageable as the number of combinations grows.
 * • If you want to add a new device (e.g., Projector), you would have to create two new classes for it (ProjectorWithBasicRemote and ProjectorWithAdvancedRemote).
 *
 * This approach violates the Open-Closed Principle because adding new features (new devices or remotes) requires modifying a lot of code.
 * */
