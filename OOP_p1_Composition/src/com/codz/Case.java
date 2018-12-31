package com.codz;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimansions;


    public Case(String model, String manufacturer, String powerSupply, Dimensions dimansions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimansions = dimansions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimansions() {
        return dimansions;
    }

    public void setDimansions(Dimensions dimansions) {
        this.dimansions = dimansions;
    }
}
