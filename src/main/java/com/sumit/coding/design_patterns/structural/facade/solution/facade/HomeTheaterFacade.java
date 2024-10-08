package com.sumit.coding.design_patterns.structural.facade.solution.facade;

import com.sumit.coding.design_patterns.structural.facade.solution.component.Amplifier;
import com.sumit.coding.design_patterns.structural.facade.solution.component.DVDPlayer;
import com.sumit.coding.design_patterns.structural.facade.solution.component.Lights;
import com.sumit.coding.design_patterns.structural.facade.solution.component.Projector;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Lights lights;
    private Projector projector;

    public HomeTheaterFacade() {
        dvdPlayer = new DVDPlayer();
        amplifier = new Amplifier();
        lights = new Lights();
        projector = new Projector();
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        lights.dim(20);
        projector.on();
        projector.setInput("DVD");
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play("Inception");
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.stop();
    }
}
