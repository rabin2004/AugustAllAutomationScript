package oOPS;

public class Child2 extends ParentClass {
	
	void test() { // non-abstract method
		
	}
	
	// not allowed in class
//	void test1(); // default abstract method - only allowed in interface
//	abstract void test2(); // abstract method
	

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.testingGrandParentClass();
		c2.testingInheritance();
		System.out.println(c2.a);
		System.out.println(c2.e);

	}

}
