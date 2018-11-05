package com.Fundamentals.Java;

public class DecisionExamples {

	
	
	public void basicIfStatement() {
		int value = 10, value2 = 15;
		
		if(value >= 11) {
			System.out.println("The if was true");
			
		}else {
			System.out.println("The else was false");
		}// end of else
		
	}// end of method
	
	public void chainIfStatement() {
		int value = 5, value2 = 10;
		
		if(value == 6) {
			System.out.println("The value was 6");
		}
		if(value2 < 10) {
			System.out.println("The value is less than 10");
		}else if (value > 4 && value2 < 15 ){
			System.out.println("both values are true ");
		}else {
			System.out.println("Nothing is true");
		}//end of false
	
	}//end of method 
	
	public void switchExample(int value) {
		String day;
		switch(value) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day ="Wednesday";
			break;
		case 3:
			day = "Friday";
			break;
		case 4:
		case 5:
		case 6:
			day = "Not my class day";
			break;
			default:
				day = "Not a valid day";
				break;
		}// end of switch 
		System.out.println(day);
	}//end of method
	
	
}//end of class 
