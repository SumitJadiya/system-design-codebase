package com.sumit.coding.design_patterns.behavioral.state.solution.model;

import com.sumit.coding.design_patterns.behavioral.state.solution.state.VendingState;
import com.sumit.coding.design_patterns.behavioral.state.solution.state.impl.IdleStateImpl;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class VendingMachine {
    private VendingState vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine() {
        vendingMachineState = new IdleStateImpl();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }
}
