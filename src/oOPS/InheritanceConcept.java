package oOPS;

public class InheritanceConcept extends ParentClass {
	
	// Inheritance - child(sub-class) can inherit property from parent(Super class) but parent can't -> keyword "extends"
	 	// Eg. class Child extends Parent
		// InheritanceConcept - child class/Sub-class
		// ParentClass - parent class/super-class
	
	// Types of Inheritance 
		// 1. Single inheritance - parent -> child
		// 2. Multi-layer inheritance - grand parent -> parent -> child
		// 3. Hierarchical inheritance - child2 <- parent -> child1
		// 4. Multiple inheritance - not allowed => parent2-> child <- parent1
	
	public String c = "Good night";
	
	public void testingLocal() {
		System.out.println("I am in InheritanceConcept class."+c);
	}
	
//	abstract void test(); // abstract methods (method without body &/or with abstract keyword) - in class not allowed

	public static void main(String[] args) {
//		ParentClass pc = new ParentClass(); // calling properties from different class if not inherited
//		System.out.println(pc.a);
//		pc.testingInheritance();
		
		// if inheritance is established then -
		System.out.println(b);
		testingStaticInheritance();
		
		InheritanceConcept ic = new InheritanceConcept(); // object of child class
		System.out.println(ic.a+" "+ic.b+" "+ic.c); // a & b from parent/ c from child
		ic.testingInheritance(); // parent class
		ic.testingLocal(); // child class
		
		// accessing grand parent property
		System.out.println(ic.e);
		ic.testingGrandParentClass();

	}

}
