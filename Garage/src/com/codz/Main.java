package com.codz;

public class Main {

    public static void main(String[] args) {

        Owner owner = new Owner("Mark", "Mustamae tee", "65874329");
        Vehicle vehiicle = new Vehicle("Toyota Prius", "white", owner);
        vehiicle.setWheels(4);
        Bikes bike = new Bikes("honda", "red");

        System.out.println("toString Printouts");
        System.out.println(vehiicle + " \n");
        System.out.println(owner + " \n");
        System.out.println(bike + " \n");
    }
}
