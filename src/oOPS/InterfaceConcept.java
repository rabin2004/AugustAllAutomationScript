package oOPS;

public interface InterfaceConcept extends ParentInterface{
	// interface VS class
		// 1. all methods in interface are abstract whereas in class it's non-abstract
		// 2. interface inherits interface only
		// 3. class can inherit interface as well - but with "implements" keywords
		// 3. class can inherit multiple interface - multiple inheritance between class and interface is allowed
	
	// implements VS extends 
			//1. extends between class to class or interface to interface
			//2. implements between class to interface - can be multiple interfaces
	
	// Interface - all the methods are default abstract
	
	void test1(); // abstract method - no abstract keyword
	abstract void test2(); // abstract method - with abstract keyword
	
	// non abstract method is not allowed in interface
//	void test3() {
//		System.out.println("non abstract method");
//	}

}
