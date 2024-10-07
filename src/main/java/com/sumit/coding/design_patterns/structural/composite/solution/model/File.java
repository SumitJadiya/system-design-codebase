package com.sumit.coding.design_patterns.structural.composite.solution.model;

import com.sumit.coding.design_patterns.structural.composite.solution.component.FileSystemComponent;

public class File implements FileSystemComponent {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println("File: " + name);
    }
}
