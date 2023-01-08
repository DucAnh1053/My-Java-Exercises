package com.patterns.strategy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Context context = new Context();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String action = sc.next();
        sc.close();

        switch (action) {
            case "addition" -> context.setStrategy(new ConcreteStrategyAdd());
            case "subtraction" -> context.setStrategy(new ConcreteStrategySubtract());
            case "multiplication" -> context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result = context.execute(a, b);
        System.out.println(result);
    }
}
