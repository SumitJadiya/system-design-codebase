package com.sumit.coding.design_patterns.creational.prototype.solution;

import com.sumit.coding.design_patterns.creational.prototype.solution.model.Student;

public class MainClass {

    public static void main(String[] args) {
        Student obj = new Student(20, 76, "Ram", 99);
        System.out.println(obj);

        // cloning the details to another object
        Student cloneObj = (Student) obj.clone();
        System.out.println(cloneObj);
    }
}
