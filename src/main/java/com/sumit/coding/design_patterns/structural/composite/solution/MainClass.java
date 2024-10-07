package com.sumit.coding.design_patterns.structural.composite.solution;

import com.sumit.coding.design_patterns.structural.composite.solution.component.FileSystemComponent;
import com.sumit.coding.design_patterns.structural.composite.solution.model.Directory;
import com.sumit.coding.design_patterns.structural.composite.solution.model.File;

public class MainClass {
    public static void main(String[] args) {

        /* Example One */
        Directory movieDirectory = new Directory("Movie");

        FileSystemComponent border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
