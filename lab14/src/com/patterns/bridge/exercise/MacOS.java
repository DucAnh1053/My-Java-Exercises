package com.patterns.bridge.exercise;

public class MacOS implements OperatingSystem {
    @Override
    public void startUp() {
        System.out.println("MacOS is starting up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Opening: " + url + " in Safari");
    }
}
