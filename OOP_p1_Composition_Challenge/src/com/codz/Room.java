package com.codz;

public class Room {
    private String color;
    private int windows;
    private String furniture;
    private String floor;
    private static int NUMBER_OF_ROOMS = 0;

    public Room(String color, int windows, String furniture, String floor) {
        this.color = color;
        this.windows = windows;
        this.furniture = furniture;
        this.floor = floor;
        NUMBER_OF_ROOMS++;
    }

    public String getColor() {
        return color;
    }

    public int getWindows() {
        return windows;
    }

    public String getFurniture() {
        return furniture;
    }

    public String getFloor() {
        return floor;
    }

    public int getNumberOfRooms() {
        return NUMBER_OF_ROOMS;
    }
}
