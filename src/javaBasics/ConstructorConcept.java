package javaBasics;

public class ConstructorConcept {
	
	// Constructor - method that carry name of the class/doesn't need return/can't be called/class is instantiated constructor will execute first
	// default constructor will be created by java if not defined
	
	ConstructorConcept(){ // Constructor overloading
		System.out.println("I am in constructor with no parameter");
	}
	
	ConstructorConcept(String a){
		System.out.println("I am in constructor with parameter");
	}
	
	private void test() { // Method overloading
		System.out.println("I am test method");
	}
	
	private void test(String a) {
		System.out.println("I am in test method with argument: "+a);
	}

	public static void main(String[] args) {
		ConstructorConcept cc = new ConstructorConcept(); // object of the class with no parameter - constructor with no parameter will be called 
		
		ConstructorConcept cc1 = new ConstructorConcept("Hello world"); // object of the class with parameter - constructor with parameter will be called 
		cc1.test();
		cc1.test("Good day");
		cc.test();
		cc.test("Good night");
		
		
	}

}
