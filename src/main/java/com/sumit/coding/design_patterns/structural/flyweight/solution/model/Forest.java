package com.sumit.coding.design_patterns.structural.flyweight.solution.model;

import com.sumit.coding.design_patterns.structural.flyweight.solution.factory.TreeFactory;
import com.sumit.coding.design_patterns.structural.flyweight.solution.flyweight.TreeType;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String type, String color, String texture) {
        TreeType treeType = TreeFactory.getTreeType(type, color, texture);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    public void renderForest() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }
}
