package com.codz;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27incg beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
//        thePC.getMonitor().drawPixalAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("windows 10");
//        thePC.getTheCase().pressPowerButton();


    }
}
