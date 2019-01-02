package com.codz;

public class Car {
    private String name = "Unknown Car";
    private boolean engine = true;
    private int cylinders;
    private int wheels = 4;
    private int doors;
    protected int speed;

    public Car(int cylinders, int doors) {
        this.cylinders = cylinders;
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    protected void setName(String name){
        this.name = name;
    }


    public  void startEngine(){
        System.out.println("Starting your " + getName() + "'s engine");
    }

    public int accelerate(int speed){
        System.out.println("Your " + getName() + " is accelerating...");
        System.out.println("adding speed ... " + speed);
        this.speed += speed;
        System.out.println("New speed ... " + this.speed);
        return this.speed;
    }

    public int brake(int speed){
        System.out.println("Your " + getName() + " is decelerating...");
        System.out.println("reducing speed by ... " + speed);
        this.speed -= speed;
        System.out.println("New motion speed is ..." + this.speed);
        return this.speed;
    }
}
