package com.codz;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "white");
        double price = hamburger.itemizedHamburger();

        hamburger.addHamburgerAddition1("tomatoe", 0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.13);
//        hamburger.addHamburgerAddition4("lettuce", 0.75);

        price = hamburger.itemizedHamburger();

        System.out.println("Total burger price is " + price);

        System.out.println("");

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.67);
        healthyBurger.addHamburgerAddition1("egg", 5.43);
        healthyBurger.addHealthyAddition1("Lenthils", 3.41);
        System.out.println("Total HealthyHamburger Price is " + healthyBurger.itemizedHamburger());

        System.out.println("");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total HealthyHamburger Price is " + deluxeBurger.itemizedHamburger());



    }
}
