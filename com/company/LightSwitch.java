package com.company;

public class LightSwitch {
    boolean isOn;

    public LightSwitch(boolean isOn){
        this.isOn = isOn;
    }

    public void turnSwitch(){
        if(isOn == false){
            System.out.println("Light was off, but now is on.");
            isOn = true;
            System.out.println("isOn = " + isOn);
        }else if(isOn == true){
            System.out.println("Light was on, but now is off.");
            isOn = false;
            System.out.println("isOn = " + isOn);
        }
    }
}

