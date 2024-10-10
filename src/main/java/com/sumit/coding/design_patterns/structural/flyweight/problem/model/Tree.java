package com.sumit.coding.design_patterns.structural.flyweight.problem.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Tree {

    private String name;
    private String color;
    private String texture;
    private int x;
    private int y;

    public void draw() {
        System.out.println("Drawing a tree of type: " + name + " at coordinates (" + x + ", " + y + ")");
    }
}
