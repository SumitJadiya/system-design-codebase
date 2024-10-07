package com.sumit.coding.design_patterns.structural.adapter.solution.adapter;

import com.sumit.coding.design_patterns.structural.adapter.solution.model.FlatPlugSocket;
import com.sumit.coding.design_patterns.structural.adapter.solution.model.RoundPlug;

public class PlugAdapter extends FlatPlugSocket {

    private final RoundPlug roundPlug;

    // Constructor that takes the round plug as input
    public PlugAdapter(RoundPlug roundPlug) {
        this.roundPlug = roundPlug;
    }

    // This method adapts the round plug to work with the flat socket
    @Override
    public void plugInFlatSocket() {
        // Delegate the call to the round plug's method
        System.out.println("Adapting the round plug to fit in the flat socket...");
        roundPlug.plugInRoundSocket();
    }
}
