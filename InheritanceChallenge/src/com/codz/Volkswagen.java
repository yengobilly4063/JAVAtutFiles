package com.codz;

import com.codz.Car;

public class Volkswagen extends Car {

    //We assume car to be <<Automatic>> NOT Manual.

    private int roadServiceMonths;

    public Volkswagen(int roadServiceMonths) {
        super("Volkswagen", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelovity = getCurrentVelocity() + rate;

        if (newVelovity == 0){
            super.stop();
            super.changeGear(1);
        }else if( (newVelovity > 0) && (newVelovity <= 10) ){
            super.changeGear(1);
        }else  if ( (newVelovity > 10) && (newVelovity <= 20) ){
            super.changeGear(2);
        }else  if ( (newVelovity > 20) && (newVelovity <= 30) ){
            super.changeGear(3);
        }else  if ( (newVelovity > 30) && (newVelovity <= 40) ){
            super.changeGear(4);
        }else  if ( (newVelovity > 40) && (newVelovity <= 50) ){
            super.changeGear(5);
        }else{
            super.changeGear(6);
        }

        if ( newVelovity > 0 ){
            super.changeVelocity( newVelovity, super.getCurrentDirection());
        }
    }
}
