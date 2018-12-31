package com.codz;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room("yellow", 3, "leather seats", "tilled");
        Room room2 = new Room("blue", 2, "fluffy seats", "wooden");

        House house = new House("wood", room1, 2);

        house.houseInfo();
    }
}
