package com.codz;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRoolType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;



    public Hamburger(String name, String meat, double price, String breadRoolType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoolType = breadRoolType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizedHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " Hamburger " + " on a " + this.breadRoolType + " roll " +
                "with meat " + this.meat +
                "price is " + this.price);
        if (this.addition1Name != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("added " + this.addition1Name + " for an extra " + this.addition1Price);
        }

        if (this.addition2Name != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }
}
