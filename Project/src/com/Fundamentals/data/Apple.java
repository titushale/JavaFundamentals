package com.Fundamentals.data;

public class Apple {
	public static final int SOUR_SCALE = 10;
	public static int SWEET_SCALE = 20;

	int size = 1;
	public String color = "Red";
	
	void myAppleMethod() {
	System.out.println("My apple method");
	}
	
	public void myAppleSecondMethod() {
		System.out.println("My apple second method");
	}
	
	protected void myAppleProtected() {
		System.out.println("My apple is protected");
	}
	
	


public void display(String type, int count) {
	display(type, count, "Green");
	
}

public void display (String type, int count, String color) {
	System.out.println(" I would like " +count+" "+type+ " apples that are " +color);
}
}