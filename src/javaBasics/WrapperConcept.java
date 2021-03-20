package javaBasics;

public class WrapperConcept {

	public static void main(String[] args) {
		
		// Wrapper concept - converting one datatype to different 
		//Eg. taking in salary data in String - 9000, 9000.0000, $9000, 9000dollar 25 cents
		//  convert salary into integer/numerical dataTypes - maths
		// Eg. DOB - String 06/16/1990, 06-16-1990 
		
		int a = 100;
		String b = "200";
		
		System.out.println(a+b);
		int integerB = Integer.parseInt(b); // pareseInt() = convert String to integer
		System.out.println(a+integerB);
		
		String convertedA = String.valueOf(a); // valueOf() = convert integer/boolean/float/double to String
		System.out.println("Number of charaters in 100: "+convertedA.length());
		
		long c = 1874282174021740L;
		String convertedCreditCardNumber = String.valueOf(c);
		int numberOfIndexCC = convertedCreditCardNumber.length();
		System.out.println(numberOfIndexCC);
		if(numberOfIndexCC==16) {
			System.out.println("valid credit card");
		}
		else {
			System.out.println("invalid credit card");
		}
		
		//Assignment:  use scanner concept/access modifier to get the value
			//1. 1874282174021740 convert into 1874-2821-7402-1740 Hint: wrapper concept/String manipulation
			//2. DOB - 01011999 convert into 01/01/1999
			//3. time - 145524 convert into 14:55:24
		
	}
}
