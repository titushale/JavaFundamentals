package com.Fundamentals.Java;
/*
 * Since this class extends square instead of shape it is not required.
 * to implement/use the methods from the shape class.
 * However you can still override them if you chose.
 * */
public class Rectangle extends Square{
	
	@Override
	public String draw() {
		return"Square Draw";
	}

}
