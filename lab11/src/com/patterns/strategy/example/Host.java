package com.patterns.strategy.example;

public class Host {
    private Strategy strategy;

    public Host() {
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void perform() {
        strategy.operation();
    }
}
