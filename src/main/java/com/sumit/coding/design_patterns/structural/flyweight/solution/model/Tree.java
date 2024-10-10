package com.sumit.coding.design_patterns.structural.flyweight.solution.model;

import com.sumit.coding.design_patterns.structural.flyweight.solution.flyweight.TreeType;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Tree {

    private int x;
    private int y;
    private TreeType type;

    public void draw() {
        type.draw(x, y);
    }
}
