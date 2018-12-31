package com.codz;

public class Main {

    public static void main(String[] args) {

        Car hyundai = new Car();

        hyundai.setModel("getz");
        System.out.println("Car model is " + hyundai.getModel() );

        hyundai.setModel("alliance");
        System.out.println("Car model is " + hyundai.getModel() );
    }
}
