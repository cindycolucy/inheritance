package com.colucy;

public class Car extends Vehicle {

    private int numberOfWheels;
    private String engineType;
    private int numberOfDoors;
    private int transmissionType;
    private int currentGear;


    public Car(String landOrSea, int speed, int numberOfWheels, String engineType, int numberOfDoors, int transmissionType) {
        super(landOrSea, speed);
        this.numberOfWheels = numberOfWheels;
        this.engineType = engineType;
        this.numberOfDoors = numberOfDoors;
        this.transmissionType = transmissionType;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Gear changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        move(speed);
        System.out.println("Move method called.");
    }

}
