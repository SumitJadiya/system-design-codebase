package com.sumit.coding.design_patterns.behavioral.command.solution.service.impl;

import com.sumit.coding.design_patterns.behavioral.command.solution.resource.Appliance;
import com.sumit.coding.design_patterns.behavioral.command.solution.service.Command;

public class TurnOffCommand implements Command {

    private final Appliance appliance;

    public TurnOffCommand(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void execute() {
        appliance.turnOff();
    }

    @Override
    public void undo() {
        appliance.turnOn();
    }
}
