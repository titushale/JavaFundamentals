package com.Fundamentals.data;

public class Pterodactyl extends Dinosaur {

	public Pterodactyl(String teeth) {
		super(teeth);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("All pterodactyls fly");
	}
	
	public void nesting() {
		System.out.println("Preparing a nest");
	}
	
	
}
