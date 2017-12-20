package com.colucy;

public class RoomApp {

    public static void main(String[] args) {

        Chair theChair = new Chair("mission", 20);
        Door theDoor = new Door("west", 66);
        Window theWindow = new Window("north", 45);

        Room theRoom = new Room(theChair, theDoor, theWindow);
        theRoom.lounge();

        }
    }


