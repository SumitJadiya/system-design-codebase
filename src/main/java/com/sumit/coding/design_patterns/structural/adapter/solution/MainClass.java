package com.sumit.coding.design_patterns.structural.adapter.solution;

import com.sumit.coding.design_patterns.structural.adapter.solution.adapter.PlugAdapter;
import com.sumit.coding.design_patterns.structural.adapter.solution.model.FlatPlugSocket;
import com.sumit.coding.design_patterns.structural.adapter.solution.model.RoundPlug;

/*
 * The Adapter Design Pattern is a structural design pattern that allows objects with incompatible interfaces to work together.
 * It’s often used to make existing classes work with others without modifying their source code.
 *
 * Key Components:
 *
 *	1.	Target: This is the interface that the client expects to use.
 *	2.	Adaptee: The existing class with an incompatible interface that needs to be adapted.
 *	3.	Adapter: A class that implements the Target interface and translates the calls to the Adaptee methods.
 *
 * */
public class MainClass {

    public static void main(String[] args) {
        // We have a round plug device
        RoundPlug roundPlug = new RoundPlug();
        System.out.print("Round Plug : ");
        roundPlug.plugInRoundSocket();

        // We want to use it with a flat socket, so we create an adapter
        FlatPlugSocket adapter = new PlugAdapter(roundPlug);

        // The adapter allows us to use the round plug in the flat socket
        System.out.print("Flat Plug : ");
        adapter.plugInFlatSocket(); // Now this works correctly!
    }
}

/*
 * Benefits of the Adapter Pattern:
 *
 *	1.	Separation of Concerns: The RoundPlug class remains focused on working with round sockets, and the FlatPlugSocket remains focused on flat sockets. The adapter handles the conversion.
 *	2.	Loose Coupling: The client code (Main) is not coupled with the RoundPlug directly. It interacts with the PlugAdapter, which conforms to the interface the client expects (FlatPlugSocket).
 *	3.	Reusability: The PlugAdapter can be reused wherever we need to adapt a round plug to a flat socket.
 * */
