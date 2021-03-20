package oOPS;

public class ParentClass extends GrandParent {
	
	public String a = "Hi";
	public static String b = "Welcome";
	
	public void testingInheritance() {
		System.out.println(a+" everybody");
	}
	
	public static void testingStaticInheritance() {
		System.out.println(b+" to Java class.");
	}

	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		
		System.out.println(pc.e);
		pc.testingGrandParentClass();
		

	}

}
