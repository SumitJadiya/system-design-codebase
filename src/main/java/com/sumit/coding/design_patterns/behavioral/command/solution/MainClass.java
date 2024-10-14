package com.sumit.coding.design_patterns.behavioral.command.solution;

import com.sumit.coding.design_patterns.behavioral.command.solution.resource.*;
import com.sumit.coding.design_patterns.behavioral.command.solution.service.Command;
import com.sumit.coding.design_patterns.behavioral.command.solution.service.impl.TurnOffCommand;
import com.sumit.coding.design_patterns.behavioral.command.solution.service.impl.TurnOnCommand;

public class MainClass {

    public static void main(String[] args) {
        // Create receivers
        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance tv = new TV();

        // Create commands for each action
        Command lightOn = new TurnOnCommand(light);
        Command lightOff = new TurnOffCommand(light);
        Command fanOn = new TurnOnCommand(fan);
        Command fanOff = new TurnOffCommand(fan);
        Command tvOn = new TurnOnCommand(tv);
        Command tvOff = new TurnOffCommand(tv);

        // Create the invoker (remote control)
        RemoteControl remote = new RemoteControl();

        // Execute commands
        remote.setCommand(lightOn);
        remote.pressButton();  // Light is turned on

        remote.setCommand(lightOff);
        remote.pressButton();  // Light is turned off

        remote.setCommand(fanOn);
        remote.pressButton();  // Fan is turned on

        remote.pressUndo();    // Undo last action, Fan is turned off

        remote.setCommand(tvOn);
        remote.pressButton();  // TV is turned on

        remote.setCommand(tvOff);
        remote.pressButton();  // TV is turned off

        // Test undo functionality
        remote.pressUndo();    // TV is turned on (undo turn off)
    }
}

/*
 * Explanation:
 *
 * 	1.	Command Interface: The Command interface defines the execute and undo methods that each concrete command class must implement.
 * 	2.	Concrete Command Classes: We create command classes like TurnOnCommand and TurnOffCommand to encapsulate the actions to be performed on an appliance. These classes implement the Command interface and store a reference to the appliance they act upon.
 * 	3.	Appliance (Receiver): The appliances (like Light, Fan, and TV) are the receivers that perform the actual action (turn on/off). Each appliance implements the Appliance interface.
 * 	4.	RemoteControl (Invoker): The RemoteControl class is the invoker, which triggers the commands. It holds the current Command object and invokes its execute or undo methods when the user presses a button or the undo button.
 * 	5.	Client: The CommandPatternDemo class acts as the client that sets up the system, creates commands, assigns them to the RemoteControl, and simulates user actions like turning appliances on/off and using the undo feature.
 *
 * Benefits of Using Command Pattern:
 *
 * 	•	Decoupling: The RemoteControl (invoker) doesn’t need to know the details of how the appliances work. It just sends commands to the appliance, and the appliance handles the rest.
 * 	•	Undo Functionality: Since commands are encapsulated as objects, undo operations are simple to implement.
 * 	•	Extensibility: It’s easy to add new commands or appliances without modifying the existing code.
 *
 * This implementation demonstrates how the Command Design Pattern can be used to encapsulate operations and provide flexibility in a system like a remote control for appliances.
 * */