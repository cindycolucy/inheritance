package com.colucy;

public class Chair {

    private String type;
    private int height;

    public Chair(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public void sit(){
        System.out.println("Sitting in the chair.");
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }
}
