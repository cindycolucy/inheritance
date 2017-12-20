package com.colucy;

public class Window {

    private String windowLocation;
    private int windowHeight;

    public Window(String windowLocation, int windowHeight) {
        this.windowLocation = windowLocation;
        this.windowHeight = windowHeight;
    }

    public String getWindowLocation() {
        return windowLocation;
    }

    public int getWindowHeight() {
        return windowHeight;
    }
}
