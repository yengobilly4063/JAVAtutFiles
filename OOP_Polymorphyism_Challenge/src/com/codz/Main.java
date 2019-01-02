package com.codz;

public class Main {

    public static void main(String[] args) {

        int randomNmber = (int) (Math.random() * 2 + 1);
        System.out.println(randomNmber);

        for (int i = 1; i<5; i++){
            Car car = new RandomCar().randomCar();
            car.accelerate(100);
            car.brake(60);
            System.out.println("");
        }

    }
}
