package com.codz;

public class Blanket {
    private String manufacturer;
    private boolean fancy;
    private String color;
    private int price;

    public Blanket(String manufacturer, boolean fancy, String color, int price) {
        this.manufacturer = manufacturer;
        this.fancy = fancy;
        this.color = color;
        this.price = price;
    }

    public void makeBlanket(){
        System.out.println("Blanket().makeBlanket(): Folding blanket");
    }
}
