package com.codz;

public class Dimensions {
    private int width;
    private int height;
    private int dept;

    public Dimensions(int width, int height, int dept) {
        this.width = width;
        this.height = height;
        this.dept = dept;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }
}
