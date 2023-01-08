package com.patterns.adapter.example;

public class DuckSimulator {
    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
