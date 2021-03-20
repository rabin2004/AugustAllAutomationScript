package javaBasics;

public class ClassInSamePkg {

	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept();
//		System.out.println(a); // not the property of this class
		System.out.println(amc.a); // allowed since public access modifier
		System.out.println(AccessModifierConcept.a); // if static better call it with class name
//		System.out.println(AccessModifierConcept.b);
		System.out.println(amc.b); // only by object reference due to non-static in nature
		
//		testMethod(); // not the property of this class
		amc.testMethod(); // allowed since public access modifier
		AccessModifierConcept.testMethod(); // if static better call it with class name
		amc.testMethodTwo(); // only by object reference due to non-static in nature
		
		System.out.println(AccessModifierConcept.c); // default property can be accessed in class within same package
		AccessModifierConcept.testMethodThree();
		
//		System.out.println(AccessModifierConcept.d); // private property can't be accessed in class within same package
//		AccessModifierConcept.testMethodFour();
		
		System.out.println(AccessModifierConcept.e); // protected protery can be accessed in class within same package
		AccessModifierConcept.testMethodFive();
		
		
	}

}
