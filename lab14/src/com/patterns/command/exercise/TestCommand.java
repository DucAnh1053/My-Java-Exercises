package com.patterns.command.exercise;

import java.util.Scanner;

public class TestCommand {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Command shutdown = new ShutDownCommand(computer);
        Command restart = new RestartCommand(computer);
        Switch computerSwitch = new Switch();

        computerSwitch.storeAndExecute(shutdown);
        computerSwitch.storeAndExecute(restart);
    }
}
