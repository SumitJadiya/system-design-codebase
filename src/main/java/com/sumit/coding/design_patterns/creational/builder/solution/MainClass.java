package com.sumit.coding.design_patterns.creational.builder.solution;

import com.sumit.coding.design_patterns.creational.builder.solution.model.Car;

public class MainClass {

    public static void main(String[] args) {
        Car car = Car
                .builder()
                .color("Yellow")
                .build();

        System.out.println(car);
    }
}

/*
 * Advantages of the Builder Pattern:
 *
 * 1. Clearer Object Construction: The CarBuilder class allows you to set only the parameters you care about, one by one, in a readable manner.
 * 2. Reduced Complexity: Optional parameters are clearly separated from required ones, and you don’t need to pass them all at once.
 * 3. Extensibility: If new fields are added, you only need to add methods in the builder class, without modifying existing constructors.
 * 4. Immutable Objects: The Car object is immutable once created, as the fields are final and can only be set via the builder.
 */