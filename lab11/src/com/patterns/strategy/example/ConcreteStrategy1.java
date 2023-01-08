package com.patterns.strategy.example;

public class ConcreteStrategy1 implements Strategy{
    @Override
    public void operation() {
        System.out.println("This is strategy 1");
    }
}
