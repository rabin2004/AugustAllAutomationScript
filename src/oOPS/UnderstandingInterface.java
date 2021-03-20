package oOPS;

public class UnderstandingInterface implements InterfaceConcept, Interface3 {

	public static void main(String[] args) {
		UnderstandingInterface ui = new UnderstandingInterface();
		ui.test1();
		ui.test2();
		ui.test5();
		ui.test6();
		ui.test3();
		ui.test4();
	}

	@Override
	public void test5() {
		System.out.println("test5");	
	}

	@Override
	public void test6() {
		System.out.println("test6");
	}

	@Override
	public void test1() {
		System.out.println("test1");
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}

	@Override
	public void test3() {
		System.out.println("test3");
	}

	@Override
	public void test4() {
		System.out.println("test4");	
	}

}
