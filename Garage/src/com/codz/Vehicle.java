package com.codz;

public class Vehicle {

    private String model;
    private String  color;
    private int wheels;

    private Owner vehicleOwner;

    public Vehicle(String model, String color, Owner vehicleOwner) {
        this.model = model;
        this.color = color;
        this.vehicleOwner = vehicleOwner;
        System.out.println("PLease allocate number of wheels for car with setWheels()");
    }

    public void setWheels(int wheels) {
        if (wheels != 3 || wheels != 4){
            System.out.println("Wheels must be either 3 or 4");
        }else{
            this.wheels = wheels;
        }
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

    public Owner getVehicleOwner() {
        return vehicleOwner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", vehicleOwner=" + vehicleOwner +
                '}';
    }
}
