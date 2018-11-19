package com.Fundamentals.Java;
/*
 * Since this class is abstract it does not have to implement the abstract methods
 * of its parent however any subclass of this class must implement those abstract
 * methods unless this class defines them itself 
 * any abstract methods of this class must be defined (implemented) in its subclasses
 * */
public abstract class GeometrySample extends Shape{
//Overrides the method from the parent class of shape 
	@Override
	public String draw() {
		return"Geometry Draw";
	}
	//Abstract method must be defined/implemented in the subclass
	abstract void geometryMethod();
		
	}
	

