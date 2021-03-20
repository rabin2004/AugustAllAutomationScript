package oOPS;

public class MethodOverridingPolymorphismConcept extends InheritanceConcept {
	
	// Method Overriding - same method present in sub & super class but with same number/types of parameter(to happen inheritance should be present)

	public String c = "Good morning";
	
	public void testingLocal() {
		System.out.println("I am in MethodOverridingConcept class.");
	}
	
	public static void main(String[] args) {
		MethodOverridingPolymorphismConcept moc = new MethodOverridingPolymorphismConcept(); // object of child class
		System.out.println(moc.c); // properties of child class - overriding parent property
		moc.testingLocal();
		moc.testingInheritance();
		
		InheritanceConcept ic = new InheritanceConcept(); // object of parent class
		System.out.println(ic.c); // properties of parent class
		ic.testingLocal();
		
		// Polymorphism - object has multiple forms/state
		InheritanceConcept moc2 = new MethodOverridingPolymorphismConcept(); // object of child class referring to parent class
		System.out.println(moc2.c); // variable gets called from parent class
		moc2.testingLocal(); // Method overriding

	}

}
