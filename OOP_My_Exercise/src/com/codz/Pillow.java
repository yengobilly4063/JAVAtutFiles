package com.codz;

public class Pillow {
    private int length;
    private int width;
    private String color;
    private String type;
    private int price;

    public Pillow(int length, int width, String color, String type, int price) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    public void makePllow(){
        System.out.println("Pillow().malePillow(): Making the pillow");
    }
}
