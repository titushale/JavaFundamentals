package com.Fundamentals.Java;

public class House {

	private String windows;
	
	public void setDoors(String doors) {
		this.doors = doors;
	}
	
	public String getDoors() {
		return doors;
	}
	private String doors;
	
	public void setHasStairs(boolean value) {
		this.hasStairs = value;
	}
	
	public boolean getHasStairs() {
		return hasStairs;
	}
	private boolean hasStairs;
	
	
	
	public void setWindows(String value) {
		this.windows = value;
	}
	
	public String getWindows() {
		return windows;
	}
	public void openDoor() {
		System.out.println("I opened a steel door");
	}
	
	public void closeDoor() {
		
	}
}
