package com.colucy;

public class Room {

    private int size;

    public Chair theChair;
    public Door theDoor;
    public Window theWindow;

    public Room(Chair theChair, Door theDoor, Window theWindow) {
        this.theChair = theChair;
        this.theDoor = theDoor;
        this.theWindow = theWindow;
    }

    public void lounge(){
        theDoor.openDoor();
        theChair.sit();
        System.out.println("Lounging in the chair.");
    }
}
