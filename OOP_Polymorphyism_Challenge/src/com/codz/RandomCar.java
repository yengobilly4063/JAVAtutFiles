package com.codz;

public class RandomCar {

    public Car randomCar(){

        int randomNumber = (int)(Math.random() * 3 + 1);
        System.out.println("Random number is " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Volkswagen(16, 4);
            case 2:
                return new Honda(24, 4);
            case 3:
                return new Car(32, 4);
        }

        return null;
    }

}
