package testPkg;

import javaBasics.AccessModifierConcept;

public class ClassInDifferentPackage {

	public static void main(String[] args) {
		System.out.println(AccessModifierConcept.a);
		AccessModifierConcept amc = new AccessModifierConcept();
		System.out.println(amc.b);
		
		AccessModifierConcept.testMethod();
		amc.testMethodTwo();
		
//		AccessModifierConcept.c; // default property not available in class within different
//		AccessModifierConcept.testMethodThree();
//		amc.c;
//		amc.testMethodThree();
		
//		AccessModifierConcept.d; // private property can't be accessed in class of different package
//		AccessModifierConcept.testMethodFour();
		
//		System.out.println(AccessModifierConcept.e); // protected property can't be accessed in class of different package
//		AccessModifierConcept.testMethodFive();
	}

}
