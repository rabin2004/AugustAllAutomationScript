package javaBasics;

public class DataTypesConcept {

	public static void main(String[] args) {
		// Line commenting
		/*this - block commenting
		are 
		notes */
		
		// main() - method/function - java is looking for main method for execution

		// DataTypes - to store a value in run time
			// 1. Primitive Data Types - byte, short, int, long, float, double, char, boolean
			// 2. Reference/Object Data Types - String

		// int - Integer - numerical values -default 0
		// creating variables
		
		int firstNumber = 10;
		System.out.println(firstNumber);
		
		// long - big numbers
		long bigNumber = 10000000L;
		System.out.println(bigNumber);
		
		// float - small decimal numbers
		float smallDecimal = 10.06f;
		System.out.println(smallDecimal);
		
		// double - big decimal numbers
		double bigDecimal = 10.999991d;
		System.out.println(bigDecimal);
		
		// char - alphabetic(upper/lower case) or numerical single digit
		char characterData = 'a'; // should inside single quote
		System.out.println(characterData);
		
		// boolean - true or false
		boolean earthIsRound = true;
		boolean earthIsNotRound = false;
		System.out.println(earthIsRound);
		System.out.println(earthIsNotRound);
		
		// String - alphanumeric values - inside " ", default null
		String a = "We are taking java class 1";
		System.out.println(a);
		
	}

}
