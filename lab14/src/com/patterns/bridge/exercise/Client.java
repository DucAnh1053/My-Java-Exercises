package com.patterns.bridge.exercise;

public class Client {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new WindowsOS());
        laptop.startUp();
        laptop.browseInternet("https://www.google.com");
        if (laptop.canMoveComputer()) {
            System.out.println("Moving computer to a new location");
        }
    }
}
