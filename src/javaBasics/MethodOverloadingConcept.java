package javaBasics;

public class MethodOverloadingConcept {
	
	// void - return type(returning nothing) 
	// test() - method name
	// { body of method } 
	
	
	// method overloading - creating methods with same name but different number or types of argument
	
	void test() { // method with no argument
		
	}
	
//	void test() { // duplicate methods not allowed in Java	
//	}
	
	void test(int a) { // method with argument with same name is allowed	
	}
	
//	void test(int a) { // duplicate method with same number & type of argument	
//	}
	
	void test(String a) { // method with same name and number of argument is allowed if the type pf argument is different
	}
	
	void test(int a, String b) { // number of argument is different	
	}

	public static void main(String[] args) {
		
	}

}
