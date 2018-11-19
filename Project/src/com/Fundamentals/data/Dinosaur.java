package com.Fundamentals.data;

public class Dinosaur {

	private String teeth;
	/**
	 * @return the teeth
	 */
	public String getTeeth() {
		return teeth;
	}
	/**
	 * @param teeth the teeth to set
	 */
	public void setTeeth(String teeth) {
		this.teeth = teeth;
	}
	/**
	 * @return the skin
	 */
	public String getSkin() {
		return skin;
	}
	/**
	 * @param skin the skin to set
	 */
	public void setSkin(String skin) {
		this.skin = skin;
	}
	private String skin;
	
	public Dinosaur(String teeth, String skin) {
		this.teeth = teeth;
		this.skin = skin;
	}
	
	public Dinosaur(String teeth) {
		this.teeth = teeth;
		this.skin = "rough";
	}
	public void move() {
		System.out.println("Most dinosaurs walk");
	
}

	
}