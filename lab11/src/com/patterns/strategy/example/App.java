package com.patterns.strategy.example;

public class App {
    public static void main(String[] args) {
        Host host = new Host();
        host.setStrategy(new ConcreteStrategy1());
        host.perform();

        host.setStrategy(new ConcreteStrategy2());
        host.perform();
    }
}
