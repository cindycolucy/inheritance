package com.colucy;

public class Vehicle {

    private String landOrSea;
    private int speed;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String landOrSea, int speed) {
        this.landOrSea = landOrSea;
        this.speed = speed;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle steering at " + currentDirection + " degrees.");
    }

    public void move(int speed){
        System.out.println("Vehicle moving at " + speed);
    }

    public String getLandOrSea() {
        return landOrSea;
    }

    public int getSpeed() {
        return speed;
    }

    public void stop(){
        speed = 0;
    }
}
