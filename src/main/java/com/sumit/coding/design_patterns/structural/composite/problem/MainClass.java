package com.sumit.coding.design_patterns.structural.composite.problem;

import com.sumit.coding.design_patterns.structural.composite.problem.model.Directory;
import com.sumit.coding.design_patterns.structural.composite.problem.model.File;

public class MainClass {
    public static void main(String args[]) {

        Directory movieDirectory = new Directory("Movie");

        File border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}

/*
 * Issues with this Approach:
 *
 *	1.	Client Needs to Handle Both Types Differently: The client (Main) has to deal with both File and Folder separately, making the code harder to maintain and extend.
 *	2.	Code Duplication: If we need to add more behavior (like delete, move), we’ll have to handle both File and Folder separately.
 *	3.	Not Scalable: The logic for handling a file and folder is scattered throughout the code.
 * */

