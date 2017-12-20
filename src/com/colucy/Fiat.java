package com.colucy;

public class Fiat extends Car {

    private String color;

    public Fiat(String color) {
        super("Land", 0, 5, "Bold", 5, 2);
        this.color = color;
    }

    public void accelerate(int rate){

        int newVelocity = getSpeed() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);

        } else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <=30){
            changeGear(3);
        } else {
            changeGear(4);
        }
        if (newVelocity > 0){
            changeVelocity(newVelocity, getSpeed());
        }
    }


}
