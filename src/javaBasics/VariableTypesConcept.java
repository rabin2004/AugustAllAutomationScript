package javaBasics;

public class VariableTypesConcept {
	static int a=50; // class variable - data assigned 
	static int b; // class variable - data not assigned
	int c; // instance variable - data not assigned
	int d=20; // instance variable - data assigned
	
	// variables Types - 3 types - location where it is being created
	// 1. Class variable/Static variable - created inside the class but outside any method, static 
	// 2. Instance variable - created inside the class but outside any method, no static keyword
	// 3. local variable - variable created inside a method
	// Arguments - variable with data, created inside the round bracket of method
	
	public static void test(){
		int a = 10; // local variable
	}
	
	public static void test1(int a) { // argument
		a=10; // a will be pointing towards argument if available, if not then points towards class variable
		
	}
	
	public static void main(String[] args) {
		int a = 10; // variable or assigning variable or creating variable or creating dataType
		int b; // local variable - without data assigned
//		int a = 10; // duplicate local variable
//		int d = 20;
		
		System.out.println(a); // point towards local variable if local variable is not available - classs variable be pointed towards
//		System.out.println(d); // if local variable is not available - Cannot make a static reference to the non-static field
	}

}

//Assignment:
//	1. odd and even number from 0-100 - use different methods (Static and non-static, different variables)
//	2. login functionality - different methods (static and non-static, different variables)
