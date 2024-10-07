package com.sumit.coding.design_patterns.structural.composite.problem.model;

public class File {

    String fileName;

    public File(String name) {
        this.fileName = name;
    }

    public void ls() {
        System.out.println("file name " + fileName);
    }
}
