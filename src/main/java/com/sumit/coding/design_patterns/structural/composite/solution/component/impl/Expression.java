package com.sumit.coding.design_patterns.structural.composite.solution.component.impl;

import com.sumit.coding.design_patterns.structural.composite.solution.component.ArithmeticExpression;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Expression implements ArithmeticExpression {

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    @Override
    public int evaluate() {
        return switch (operation) {
            case ADD -> leftExpression.evaluate() + rightExpression.evaluate();
            case SUBTRACT -> leftExpression.evaluate() - rightExpression.evaluate();
            case MULTIPLY -> leftExpression.evaluate() * rightExpression.evaluate();
            case DIVIDE -> leftExpression.evaluate() / rightExpression.evaluate();
        };
    }
}
