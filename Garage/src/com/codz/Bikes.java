package com.codz;

public class Bikes {
    private String model;
    private String  color;
    private int wheels;

    public Bikes(String model, String color) {
        this.model = model;
        this.color = color;
        this.wheels = 2;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Bikes{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
