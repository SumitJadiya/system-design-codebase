package com.sumit.coding.design_patterns.structural.composite.solution.component.impl;

import com.sumit.coding.design_patterns.structural.composite.solution.component.ArithmeticExpression;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Number implements ArithmeticExpression {
    int value;

    @Override
    public int evaluate() {
        System.out.println("Number value is : " + value);
        return value;
    }
}
