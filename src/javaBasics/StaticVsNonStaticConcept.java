package javaBasics;

public class StaticVsNonStaticConcept {
	
	static int a=10; // class variable/static variable
	static int b=20;
	int c = 30; // instance variable/non-static variable
	int d = 40;
	
	public static void addition() { // static method
		System.out.println("Addition of a & b: "+(a+b)); // option 1
		
		int c = StaticVsNonStaticConcept.a+StaticVsNonStaticConcept.b; // option 2
		System.out.println("Addition of a & b with className: "+c);
		
		StaticVsNonStaticConcept snc = new StaticVsNonStaticConcept(); // object of class
		int d = snc.a+snc.b; // option 3
		System.out.println("Addition of a & b with objecRefName: "+d);
		
//		System.out.println(c+d); // not allowed - direct calling
//		StaticVsNonStaticConcept.c+StaticVsNonStaticConcept.d; // not allowed - calling with className
		int e = snc.c+snc.d;
		System.out.println("Addition of c & d with objectRefName: "+e); // only option 3 is allowed - non-static	
	}
	
	public void substraction() { // non-static method
		System.out.println("Substraction of a & b: "+(a-b)); // option 1
		
		int c = StaticVsNonStaticConcept.a-StaticVsNonStaticConcept.b; // option 2
		System.out.println("Substraction of a & b with className: "+c);
		
		StaticVsNonStaticConcept snc = new StaticVsNonStaticConcept(); // object of class
		int d = snc.a-snc.b; // option 3
		System.out.println("Substraction of a & b with objecRefName: "+d);
		
//		System.out.println(c-d); // not allowed - direct calling
//		StaticVsNonStaticConcept.c-StaticVsNonStaticConcept.d; // not allowed - calling with className
		int e = snc.c-snc.d;
		System.out.println("Substraction of c & d with objectRefName: "+e);
	}

	public static void main(String[] args) { // main method - default static method
		
		// static method/variable - can be called directly or can be called with the use of className or can be called with the use of ObjectReferenceName
		// non-static method/variable - can only be called objectReferenceName
		// if not followed - static and non-static mismatch error or warning will displayed
		
//		addition(); // option 1
//		StaticVsNonStaticConcept.addition(); // option 2
		
		StaticVsNonStaticConcept snc = new StaticVsNonStaticConcept();
		snc.addition();// option3
		
//		substraction(); // option 1 - not allowed
//		StaticVsNonStaticConcept.substraction(); // option 2 - not allowed
		snc.substraction(); // option 3 - only allowed
	}

}
