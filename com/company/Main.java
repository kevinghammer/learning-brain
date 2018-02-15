package com.company;

public class Main {

    public static void main(String[] args) {
	Dimensions theScreenDimensions = new Dimensions(35, 50, 1080);
	LightSwitch theLightSwitch = new LightSwitch(false);
	Television theTelevision = new Television(12, 50, false, theScreenDimensions);
	Couch theCouch = new Couch(3, 4, "Blue and Grey");

	FamilyRoom theFamilyRoom = new FamilyRoom(theTelevision, theLightSwitch, theCouch);
	theFamilyRoom.checkTv();
	theLightSwitch.turnSwitch();

	//the light was on... now this will turn this off.
	theLightSwitch.turnSwitch();

    }
}
