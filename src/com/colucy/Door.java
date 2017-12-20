package com.colucy;

public class Door {

    private String doorLocation;
    private int doorHeight;

    public Door(String doorLocation, int doorHeight) {
        this.doorLocation = doorLocation;
        this.doorHeight = doorHeight;
    }

    public void openDoor(){
        getDoorLocation();
        System.out.println("Opening the door.");
    }

    public String getDoorLocation() {
        return doorLocation;
    }

    public int getDoorHeight() {
        return doorHeight;
    }
}
