package com.sumit.coding.design_patterns.structural.flyweight.problem;

import com.sumit.coding.design_patterns.structural.flyweight.problem.model.Forest;

public class MainClass {

    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(1, 2, "Oak", "Green", "OakTexture");
        forest.plantTree(3, 4, "Pine", "Dark Green", "PineTexture");
        forest.plantTree(5, 6, "Oak", "Green", "OakTexture");  // Same type, color, and texture as above
        forest.plantTree(7, 8, "Cherry", "Pink", "CherryTexture");
        forest.plantTree(9, 10, "Pine", "Dark Green", "PineTexture");  // Same as another pine

        forest.renderForest();
    }
}

/*
 * Issues Without the Flyweight Pattern:
 *
 *	1. Memory Inefficiency:
 *	• Every tree object stores the same redundant information for its name, color, and texture, even if multiple trees are of the same type.
 *	• For example, if there are 1,000 Oak trees, each one stores the string "Oak", "Green", and "OakTexture". This leads to excessive memory usage, especially if each tree has a significant amount of intrinsic data (e.g., detailed textures, type properties).
 *	• In a large system (e.g., rendering a forest with thousands of trees), the memory consumption could become enormous, as the same data is repeated across all tree objects.
 *	2. Redundancy:
 *	• Each object contains its full data (intrinsic + extrinsic properties), leading to unnecessary redundancy. The Flyweight Pattern solves this by sharing intrinsic properties, reducing the duplication of data.
 *	• Without Flyweight, we have no efficient way to share the common parts of an object between multiple instances.
 *	3. Performance:
 *	• The system may become slow due to the need to allocate memory for each tree instance, even though many instances share the same properties. Each time a new tree is created, memory is allocated for properties like name, color, and texture, even though they are identical to other trees.
 *	• The garbage collector will also have more work to do since more objects will be created and discarded, adding additional overhead.
 *
 * Memory Usage Comparison:
 *
 * If we assume:
 *
 *	• Each String for name, color, and texture uses 50 bytes,
 *	• A tree’s position (x, y) uses 8 bytes,
 *
 * For 10,000 trees, let’s calculate memory usage:
 *
 * Without Flyweight:
 *
 * Each tree has its own copy of name, color, and texture.
 *
 *	• Memory per tree: 50 (name) + 50 (color) + 50 (texture) + 8 (x, y) = 158 bytes.
 *	• For 10,000 trees: 10,000 * 158 bytes = 1,580,000 bytes (~1.5 MB).
 *
 * With Flyweight:
 *
 * Only one instance of name, color, and texture is shared among similar trees.
 *
 *	• Memory per tree: 8 bytes for x and y + shared memory for name, color, and texture.
 *	• Assume 3 unique tree types: Oak, Pine, Cherry.
 *	• Shared memory for tree types: 3 * (50 + 50 + 50) = 450 bytes.
 *	• Memory for 10,000 trees: 10,000 * 8 bytes + 450 bytes = 80,450 bytes (~80 KB).
 *
 * Conclusion:
 *
 * Without the Flyweight Pattern:
 *
 *	• Memory consumption is significantly higher (1.5 MB vs. 80 KB for 10,000 trees).
 *	• Redundancy leads to inefficiency, especially with large numbers of objects that share the same properties.
 *	• Performance may degrade due to the creation and management of many redundant objects.
 *
 * The Flyweight Pattern optimizes memory usage by sharing common, intrinsic data across multiple instances, making it especially useful in scenarios where many objects share similar states.
 *
 * */