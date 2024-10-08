package com.sumit.coding.design_patterns.creational.prototype.problem;

import com.sumit.coding.design_patterns.creational.prototype.problem.model.Student;

public class MainClass {

    public static void main(String[] args) {
        Student obj = new Student(20, 76, "Ram", 99);

        // cloning the details to another object
        Student cloneObj = new Student();

        cloneObj.setAge(obj.getAge());
        cloneObj.setRollNumber(obj.getRollNumber());
        cloneObj.setName(obj.getName());
//        cloneObj.setMarks(obj.getMarks());
        /*
         * Problem :
         * 1. client is cloning, client has to know all details before cloning. (what if we're cloning 100 obj??)
         * 2. There could be an instance variable which is private and can't be accessed for cloning
         * */
    }
}
