package com.Fundamentals.Java;

public class OperatorExamples {

	int numValue1 = 25, numValue2 = 43;
	// Method increments the value by 1; same as numValue = numValue + 1;
	public void incrementSample () {
		numValue1 ++;
		
	System.out.println(numValue1);
	
	int value = ++ numValue1;
	System.out.println(value);
		
	}
	public void decrementsample() {
		numValue1--;
		System.out.println(numValue1);
		
		int value = -- numValue1;
		System.out.println(value);
	}
	
	public void equalsExample() {
		String a = "happy", b = "Happy", c = new String("happy");
		
		System.out.println(a.equals(b)); 
		System.out.println(a==c);
		System.out.println(a.equals(c));
		}
	
public void equalsExample2() {
	int val1 = 10, val2 = 10;
	double val3 = 10.0;
	System.out.println(val1 == val2);
	System.out.println(val2 == val3);
			
}
	// Logical operator compares two expressions using and/ or
// and means both expressions must be true 
// or means the first expression must be true otherwise the second one is checked 
// if the second is also false the whole statement is 
public void logicalExamples() {
	int val = 15, val2 = 25, val3 = 16, val4 = 25;
	System.out.println(val == val3 && val2 == val4);
	System.out.println(val == val3 || val2 == val4);
	System.out.println(!(val2 == val4));
	System.out.println(val != val2);
}
	
	
	
	
	
}
