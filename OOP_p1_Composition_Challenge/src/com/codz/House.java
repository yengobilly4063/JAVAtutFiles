package com.codz;

public class House {
    private String buldingMaterial;
    private Room room;
    private int kitchen;

    public House(String buldingMaterial, Room room, int kitchen) {
        this.buldingMaterial = buldingMaterial;
        this.room = room;
        this.kitchen = kitchen;
    }


    private String getBuldingMaterial() {
        return buldingMaterial;
    }

    private Room getRoom() {
        return room;
    }

    private int getKitchen() {
        return kitchen;
    }

    public void houseInfo(){
        System.out.println("This house contains " + getRoom().getNumberOfRooms() +" rooms " +
                getKitchen() +" kitchens and is made out of " + getBuldingMaterial() + " materials");
    }
}
