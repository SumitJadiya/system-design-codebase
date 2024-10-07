package com.sumit.coding.design_patterns.structural.adapter.problem;

import com.sumit.coding.design_patterns.structural.adapter.problem.model.FlatPlugSocket;
import com.sumit.coding.design_patterns.structural.adapter.problem.model.RoundPlug;

public class MainClass {
    public static void main(String[] args) {
        // Client expects a flat plug socket
        FlatPlugSocket flatPlugSocket = new FlatPlugSocket();

        // We only have a round plug device
        RoundPlug roundPlug = new RoundPlug();

        // The problem is: how do we make the round plug work with the flat socket?
        // Let's assume we just directly try to use the round plug (which is incorrect)
        // This is problematic because they are incompatible!
        roundPlug.plugInRoundSocket(); // This won't work with flat socket

        // Now, we're stuck because we can't make the round plug fit the flat socket directly.
        flatPlugSocket.plugInFlatSocket(); // This works fine but not with round plug!
    }
}

/*
 * If we don’t use the Adapter Pattern, we now face a problem. The client expects a FlatPlugSocket, but our device (RoundPlug) doesn’t work with it.
 * To solve this, we could awkwardly attempt to modify the client code or introduce conditional logic, breaking the SRP and leading to tightly coupled code.
 * */
