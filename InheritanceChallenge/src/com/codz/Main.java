package com.codz;

public class Main {

    public static void main(String[] args) {
        Volkswagen volkswagen = new Volkswagen(36);

        volkswagen.steer(45);
        volkswagen.accelerate(30);
        System.out.println("");
        volkswagen.accelerate(20);
        System.out.println("");
        volkswagen.accelerate(-42);

    }
}
