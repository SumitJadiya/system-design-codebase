package com.sumit.coding.design_patterns.structural.facade.problem;

import com.sumit.coding.design_patterns.structural.facade.problem.component.Amplifier;
import com.sumit.coding.design_patterns.structural.facade.problem.component.DVDPlayer;
import com.sumit.coding.design_patterns.structural.facade.problem.component.Lights;
import com.sumit.coding.design_patterns.structural.facade.problem.component.Projector;

public class MainClass {

    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        Lights lights = new Lights();

        // Complex steps to watch a movie
        lights.dim(20);
        projector.on();
        projector.setInput("DVD");
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play("Inception");

        // Stop watching movie
        dvdPlayer.stop();
    }
}

/*
 * Problems:
 *
 * 1. Complex Client Code: The client needs to know the detailed sequence of how to interact with each subsystem. This leads to complex and hard-to-maintain code.
 * 2. Lack of Abstraction: The client is tightly coupled to the subsystems, which means any changes in the subsystems might break the client code.
 * 3. Error-prone: The sequence of operations can easily go wrong.
 * */