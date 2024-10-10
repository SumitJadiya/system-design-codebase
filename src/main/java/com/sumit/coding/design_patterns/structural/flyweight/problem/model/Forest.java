package com.sumit.coding.design_patterns.structural.flyweight.problem.model;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        Tree tree = new Tree(name, color, texture, x, y);
        trees.add(tree);
    }

    public void renderForest() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}
