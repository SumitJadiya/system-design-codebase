package com.sumit.coding.design_patterns.creational.builder.problem.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Car {
    private String make;
    private String model;
    private String engineType;
    private int year;
    private String color;
    private boolean hasSunroof;
    private int cubicCapacity;
}
