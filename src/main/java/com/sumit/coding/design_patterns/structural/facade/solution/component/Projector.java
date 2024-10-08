package com.sumit.coding.design_patterns.structural.facade.solution.component;

public class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void setInput(String input) {
        System.out.println("Setting input source to: " + input);
    }
}
