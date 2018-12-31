package com.codz;

public class BedSheets {
    private String type;
    private String color;
    private int price;
    private boolean stripped;

    public BedSheets(String type, String color, int price, boolean stripped) {
        this.type = type;
        this.color = color;
        this.price = price;
        this.stripped = stripped;
    }

    public void makeBedSheets(){
        System.out.println("BedSheets().makeBedSheets(): Folding bedsheets");
    }
}
