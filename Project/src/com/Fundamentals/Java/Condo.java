package com.Fundamentals.Java;

public class Condo extends House{
private boolean hasBalcony;

public void setHasBalcony(boolean hasBalcony) {
	this.hasBalcony = hasBalcony;
	
}

public boolean getHasBalcony() {
	return hasBalcony;
}
@Override
public void openDoor() {
	super.openDoor();
	System.out.println("I opened a wooden door");
}
}