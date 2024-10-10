package com.sumit.coding.design_patterns.structural.flyweight.solution;

import com.sumit.coding.design_patterns.structural.flyweight.solution.model.Forest;

public class MainClass {

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(10, 20, "Oak", "Green", "Rough");
        forest.plantTree(30, 40, "Pine", "Dark Green", "Smooth");
        forest.plantTree(50, 60, "Oak", "Green", "Rough");

        forest.renderForest();
    }
}

/*
 * Explanation:
 *
 *	1.	TreeType (Flyweight): Represents the shared intrinsic state (type, color, texture) of a tree. It does not store the coordinates x and y.
 *	2.	TreeFactory (Flyweight Factory): Manages and provides instances of TreeType. If a TreeType already exists, it is reused instead of creating a new one.
 *	3.	Tree (Context): Stores the extrinsic state (x, y) and holds a reference to the TreeType flyweight object.
 *	4.	Forest (Client): Manages the creation of trees and renders them using shared TreeType objects.
 * */