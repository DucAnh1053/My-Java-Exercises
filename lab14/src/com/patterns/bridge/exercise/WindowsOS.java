package com.patterns.bridge.exercise;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startUp() {
        System.out.println("Windows is starting up");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Opening: " + url + " in Edge");
    }
}
