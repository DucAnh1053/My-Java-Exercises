package com.patterns.singleton;

public class App {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM table");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM table2");
    }
}
