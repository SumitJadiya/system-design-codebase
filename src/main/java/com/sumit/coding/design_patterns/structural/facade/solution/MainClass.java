package com.sumit.coding.design_patterns.structural.facade.solution;

import com.sumit.coding.design_patterns.structural.facade.solution.facade.HomeTheaterFacade;

public class MainClass {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(); // using the default setup

        // Complex steps to watch a movie
        homeTheater.watchMovie();

        System.out.println();

        // Stop watching movie
        homeTheater.endMovie();
    }
}

/*
 * Problems:
 *
 * Advantages:
 *
 *	1. Simplified Client Code: The client interacts only with the HomeTheaterFacade class and doesn’t need to know about the internal workings of the subsystems.
 *	2. Decoupled Subsystems: The facade abstracts the subsystems from the client. This reduces coupling and makes the code easier to maintain.
 *	3. Error Reduction: The facade ensures that the steps to use the system are followed correctly.
 *
 * Disadvantages:
 *
 *	1. Reduced Flexibility: The facade may not provide full access to all functionalities of the subsystems. If the client needs more specific control, it would have to bypass the facade.
 *	2. Maintenance: If the facade tries to cover too much or becomes overly complex, it can become difficult to maintain itself.
 * */