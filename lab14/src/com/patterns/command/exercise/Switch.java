package com.patterns.command.exercise;

import java.util.ArrayList;
import java.util.List;

public class Switch {
    private List<Command> commandList;

    public Switch() {
        this.commandList = new ArrayList<>();
    }

    public void storeAndExecute(Command command) {
        commandList.add(command);
        command.execute();
    }
}
