package com.sumit.coding.design_patterns.creational.builder.solution.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
@AllArgsConstructor
public class Car {
    // required parameters
    private String make;
    private String model;

    // optional
    private String engineType;
    private int year;
    private String color;
    private boolean hasSunroof;
    private int cubicCapacity;
}
