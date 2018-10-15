package com.Fundamentals.Java;

import java.util.Scanner;

public class WelcomeToJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//someMethod();
//stringExamples();
//moreStringExamples();
//dataTypeExamples		
		scannerExample();

	}

	public static void someMethod() {
		System.out.println("Welcome to Java ");
	}

	public static void stringExamples() {
		// String = Type [str1 = variable] name Welcome = string literal
		String str1 = "Welcome";
		String str2 = new String("Java");
		System.out.println(str2);
		// charAt method returns a single character at a certain position
		char j = str1.charAt(2);// index is zero based
		System.out.println(j);
		// concat method joins two strings together; called concatenation
		String name = str2.concat(" is cool");
		System.out.println(name);
		// equals method will check to see if an object equals the string variable
		boolean isMyString = str1.equals(str2); // is str2 = str1?
		System.out.println(isMyString);
		// toLowerCase method will make the variable with lower case letters
		String myString = str1.toLowerCase();
		System.out.println(myString);
		// toUpperCase method will make the variable with upper case letters
		String mySecondString = str2.toUpperCase();
		System.out.println(mySecondString);
	}

	public static void moreStringExamples() {
		String myString = "My Java String";
		// Are these equal?
		boolean isTheSame = myString.toLowerCase().equals("my java string");
		System.out.println(isTheSame);
		// myString is capitalized and added to is so capitalized
		String name = myString.toUpperCase().concat(" is so capatalized");
		System.out.println(name);
		// equalsignoreCase does not check if it has capitalization it is ignored
		boolean testString = myString.equalsIgnoreCase("My java string");
		System.out.println(testString);
		// contains method checks to see if it matches part of the variable
		boolean isContained = myString.contains("ava");
		System.out.println(isContained);
	}

	public static void primitiveExamples() {
		// Example of the use of Scanner
		PrimitiveExamples pe = new PrimitiveExamples();
		pe.myFirstPrimitiveMethod();

		pe.myAddition();
		pe.mySubtraction();
		pe.myMultiplication();
		pe.myDivision();
		pe.myModulus();
		pe.myOrderOp();
	}

	public static void scannerExample() {
		int x, y, z;
		System.out.println("Enter two integers to calculate their sum");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("Sum of entered integers = " + z);

	}

}
