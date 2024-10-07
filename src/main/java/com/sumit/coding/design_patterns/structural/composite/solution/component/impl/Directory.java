package com.sumit.coding.design_patterns.structural.composite.solution.component.impl;

import com.sumit.coding.design_patterns.structural.composite.solution.component.FileSystemComponent;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    // Add a file or folder to the folder
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void ls() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.ls();
        }
    }
}
