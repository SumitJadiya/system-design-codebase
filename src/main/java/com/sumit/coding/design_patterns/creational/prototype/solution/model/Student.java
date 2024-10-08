package com.sumit.coding.design_patterns.creational.prototype.solution.model;

import com.sumit.coding.design_patterns.creational.prototype.solution.service.Prototype;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student implements Prototype {
    int age;
    int rollNumber;
    String name;
    private int marks;

    private int getMarks() {
        return marks;
    }

    @Override
    public Prototype clone() {
        return new Student(age, rollNumber, name, marks);
    }
}
