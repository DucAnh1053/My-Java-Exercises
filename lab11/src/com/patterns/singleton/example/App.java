package com.patterns.singleton.example;

public class App {
    public static void main(String[] args) {
        Balloon balloon1 = Balloon.getInstance("red");
        Balloon balloon2 = Balloon.getInstance("yellow");

        System.out.println(balloon1 == balloon2);
        System.out.println(balloon2.getColor());
    }
}
