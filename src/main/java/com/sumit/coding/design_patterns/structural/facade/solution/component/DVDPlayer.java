package com.sumit.coding.design_patterns.structural.facade.solution.component;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("DVD Player stopped");
    }
}
