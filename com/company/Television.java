package com.company;

public class Television {
    private int volume;
    private int brightness;
    private boolean tvOn;
    private Dimensions screenDimensions;

    public Television(int volume, int brightness, boolean tvOn, Dimensions screenDimensions){
        this.volume = volume;
        this.brightness = brightness;
        this.tvOn = tvOn;
        this.screenDimensions = screenDimensions;
    }

    public void isTvOn(){
        System.out.println("The TV is currently on, true or false " + tvOn);
    }

    public void setTvOn(boolean tvOn) {
        this.tvOn = tvOn;
    }


}
