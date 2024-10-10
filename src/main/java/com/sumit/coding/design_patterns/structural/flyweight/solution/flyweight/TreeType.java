package com.sumit.coding.design_patterns.structural.flyweight.solution.flyweight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TreeType {
    private String type;
    private String color;
    private String texture;

    public void draw(int x, int y) {
        System.out.println("Drawing " + color + " colored tree of type: " + type + " and " + texture + " texture at coordinates: (" + x + ", " + y + ")");
    }
}
