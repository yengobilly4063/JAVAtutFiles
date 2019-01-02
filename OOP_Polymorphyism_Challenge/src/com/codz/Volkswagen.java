package com.codz;

public class Volkswagen extends Car {
    private String  model = "passat";

    public Volkswagen(int cylinders, int doors){
        super(cylinders, doors);
        super.setName("Volkswagen");
    }

    public String getModel(){
        return this.model;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting your " + getName() + " " + getModel() + "'s engine");
    }

    @Override
    public int accelerate(int speed) {
        System.out.println("Your " + getName() + " " + getModel() + " is accelerating...");
        System.out.println("adding speed ... " + speed);
        super.speed += speed;
        System.out.println("New speed ... " + super.speed);
        return super.speed;
    }

    @Override
    public int brake(int speed) {
        System.out.println("Your " + getName() + " " + getModel() + " is decelerating...");
        System.out.println("reducing speed by ... " + speed);
        super.speed -= speed;
        System.out.println("New motion speed is ..." + super.speed);
        return super.speed;
    }
}
