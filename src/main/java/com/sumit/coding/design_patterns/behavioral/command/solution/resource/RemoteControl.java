package com.sumit.coding.design_patterns.behavioral.command.solution.resource;

import com.sumit.coding.design_patterns.behavioral.command.solution.service.Command;
import lombok.Setter;

public class RemoteControl {

    @Setter
    private Command command;
    private Command lastCommand;

    public void pressButton() {
        command.execute();
        lastCommand = command;  // Store the last executed command
    }

    public void pressUndo() {
        if (lastCommand != null)
            lastCommand.undo();  // Undo the last command
        else
            System.out.println("No action to undo.");
    }
}
