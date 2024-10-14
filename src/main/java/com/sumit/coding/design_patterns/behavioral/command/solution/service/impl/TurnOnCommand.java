package com.sumit.coding.design_patterns.behavioral.command.solution.service.impl;

import com.sumit.coding.design_patterns.behavioral.command.solution.resource.Appliance;
import com.sumit.coding.design_patterns.behavioral.command.solution.service.Command;

public class TurnOnCommand implements Command {
    private final Appliance appliance;

    public TurnOnCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        appliance.turnOn();
    }

    @Override
    public void undo() {
        appliance.turnOff();
    }
}
