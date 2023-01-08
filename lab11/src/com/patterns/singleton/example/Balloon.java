package com.patterns.singleton.example;

public class Balloon {
    private static Balloon instance;
    private String color;

    private Balloon(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static Balloon getInstance(String color) {
        if (instance == null) {
            instance = new Balloon(color);
        }
        return instance;
    }
}
