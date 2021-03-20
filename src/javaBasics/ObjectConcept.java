package javaBasics;

public class ObjectConcept {
	
	static int legs = 4; // state
	static int eyes = 2;
	static String name = "Tom";
	
	public static void bark() {
		System.out.println(name+" can bark.");
	}
	
	public static void run() {
		System.out.println(name+" with "+legs+" legs and "+eyes+" eyes can run.");
	}

	public static void main(String[] args) {
		// Java - programming language - Object Oriented Programming language (OOPS language)
		// Object - something that has state and behaviors/ state = variables and behavior = methods/functions
		// Object, Dog - types/Number/Name of dogs behavior - bark/walk/run/eat 
		
						//  object
		ObjectConcept oc = new ObjectConcept(); // object of the class
		// referring class referenceName = new(Keyword) object();

		System.out.println(oc.name);
		oc.bark();
		oc.run();
	}

}
