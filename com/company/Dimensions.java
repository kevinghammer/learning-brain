package com.company;

public class Dimensions {
    private int height;
    private int width;
    private int resolution;

    public Dimensions(int height, int width, int resolution){
        this.height = height;
        this.width = width;
        this.resolution = resolution;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getResolution() {
        return resolution;
    }
}
