package com.sumit.coding.design_patterns.creational.builder.problem;

import com.sumit.coding.design_patterns.creational.builder.problem.model.Car;

public class MainClass {

    public static void main(String[] args) {
        // Instantiating Car with a long list of parameters
        Car car = new Car("Toyota", "Camry", "V6", 2023, "Black", true, 1200);
        System.out.println(car);
    }
}

/*
 * Problems:
 *
 * 1. Long Parameter List: The constructor takes a lot of parameters. It’s difficult to remember their order, leading to confusion and mistakes.
 * 2. Hard to Extend: If you want to add more optional attributes, you’ll need to modify the constructor, further complicating the parameter list.
 * 3. Low Readability: It’s unclear what each argument represents when creating a Car object.
 * 4. Optional Parameters: Handling optional parameters is clumsy. There is no way to easily exclude or default certain parameters without overloading constructors.
 */