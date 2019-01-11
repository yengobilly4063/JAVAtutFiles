package com.codz;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i<5; i++){
            Car car = new RandomCar().randomCar();
            car.accelerate(100);
            car.brake(60);
            System.out.println("");
        }

    }
}
