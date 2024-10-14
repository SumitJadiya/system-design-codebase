package com.sumit.coding.design_patterns.behavioral.command.problem;

import com.sumit.coding.design_patterns.behavioral.command.problem.model.Fan;
import com.sumit.coding.design_patterns.behavioral.command.problem.model.Light;
import com.sumit.coding.design_patterns.behavioral.command.problem.model.RemoteControl;

public class MainClass {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light lightOne = new Light();
        remoteControl.pressLightOn(lightOne);
        remoteControl.pressUndo(lightOne, new Fan());
    }
}

/*
 * If you don’t use the Command Pattern in situations where it is suitable, the following problems may occur:
 *
 * 	1.	Tight Coupling: The invoker (e.g., a button or a menu option) is tightly coupled to the receiver (e.g., specific operations or actions), making the system harder to extend or modify.
 * 	2.	Difficult to Extend: Adding new commands (operations) would require changes in multiple places, especially in the invoker, violating the Open/Closed Principle.
 * 	3.	No Undo/Redo Functionality: Without encapsulating actions as objects, implementing features like undo and redo becomes complex and error-prone.
 * 	4.	Harder to Queue or Log Commands: If commands are not encapsulated as objects, you lose the ability to queue, schedule, or log commands easily, making it difficult to add advanced features like task queues.
 * 	5.	Code Duplication: Without a common structure (command interface), repetitive code may arise for different operations, reducing maintainability and increasing the chance of errors.
 * 	6.	Inflexible System: The system becomes less flexible as you can’t easily change or reuse commands, making it harder to swap, modify, or extend behavior dynamically.
 * 	7.	Limited Encapsulation: The logic for performing actions remains exposed in multiple places, breaking encapsulation principles and making the system harder to reason about.
 * 	8.	Complex Client Code: The client (invoker) has to know too many details about how to execute commands, leading to bloated, complex code.
 * */