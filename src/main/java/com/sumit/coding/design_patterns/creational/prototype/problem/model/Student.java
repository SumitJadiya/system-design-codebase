package com.sumit.coding.design_patterns.creational.prototype.problem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    int age;
    int rollNumber;
    String name;
    private int marks;

    private int getMarks() {
        return marks;
    }
}
