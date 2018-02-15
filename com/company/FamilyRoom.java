package com.company;

public class FamilyRoom {
    private Television theTv;
    private LightSwitch theLightSwitch;
    private Couch theCouch;

    public FamilyRoom(Television theTv, LightSwitch theLightSwitch, Couch theCouch){
        this.theTv = theTv;
        this.theLightSwitch = theLightSwitch;
        this.theCouch = theCouch;
    }

    public void checkTv(){
        theTv.setTvOn(false);
        System.out.println("You checked the TV.");
    }

}
