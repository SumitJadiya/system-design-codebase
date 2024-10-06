package com.sumit.coding.design_patterns.behavioral.state.solution.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemShelf {
    int code;
    Item item;
    boolean soldOut;
}
