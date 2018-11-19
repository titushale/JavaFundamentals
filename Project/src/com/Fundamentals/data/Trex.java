package com.Fundamentals.data;

public class Trex extends Dinosaur{
	
	public  Trex (String teeth, String skin) {
		super(teeth,skin);
	}
	
	@Override
	public void move() {
		System.out.println("All Trexs run");
	}
	
	public void devourPrey() {
		System.out.println("Trex devours its prey");
	}
	
	
}
