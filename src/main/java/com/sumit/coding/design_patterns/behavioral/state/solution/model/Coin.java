package com.sumit.coding.design_patterns.behavioral.state.solution.model;

public enum Coin {

    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    public int value;

    Coin(int value) {
        this.value = value;
    }
}

