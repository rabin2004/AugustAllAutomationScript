package javaBasics;

public class IfElseConditionConcept {

	public static void main(String[] args) {
		// if-else condition - inserting sense into script to verify - verification point (check point)
		// 1. if-condition - condition provided - if match - then script inside if block will execute other it will not
		// 2. else if-condition - condition provided - if-condition is not fulfilled then it will come to else if block - if condition fulfills then else if block script will execute
		// 3. else condition - doesn't have condition side - will execute only if-condition & else if-condition doesn't fulfill

		int a=10;
		int b=10;
		int c=10;
		
//		System.out.println(a!=b);
		
		// if and else block
//		if(a==b) {
//			System.out.println("a is equal to b, Test passed");
//		}
//		else {
//			System.out.println("a is not equal to be, Test failed");
//		}
		
		// if only block - condition fulfilled
//		if(a==c) {
//			System.out.println("a is equal to c, Test Passed");
//		}
		
		// if only block - condition not fulfilled
//		if(a!=c) {
//			System.out.println("a is not equal to c, Test Failed");
//		}
		
//		if(a==b) {
//			System.out.println("a is equal to b");
//		}
//		else if(a==c) {
//			System.out.println("a is equal to c");
//		}
//		else if(b==c) {
//			System.out.println("b is equal to c");
//		}
//		else {
//			System.out.println("a, b & c are different");
//		}
		
		String x = "Java";
		String y = "Selenium";
		String z = "java";
		
		// condition 1 - sensitive to upper/lower case
//		if(x.equals(z)) {
//			System.out.println("x is equal to z");
//		}
//		else {
//			System.out.println("x is not equal to z");
//		}
//		
//		// condition 2 - not sensitive to upper/lower case
//		if(x.equalsIgnoreCase(z)) {
//			System.out.println("x is equal to z");
//		}
//		else {
//			System.out.println("x is not equal to z");
//		}
		
		String name1 = "John";
		int age1 = 30;
		String name2 = "Joe";
		int age2 = 25;
		
//		if(name1.equalsIgnoreCase(name2))
//			System.out.println(name1+" and "+name2+" have same name.");
//		else
//			System.out.println(name1+" and "+name2+" are different customer.");
		
		//Customer Tom - username tom12 & password tom@123
		// Registered customer
		// after registration - login credentials - stored in DB
		// login - username tom12 & password tom@123
		// if-else condition tom12==tom12(DB) && tom@123==tom@123(DB) then login should happen
		
		String inputUsername = "tom12";
		String inputPassword = "tom@123";
		String DBusername = "Tom12";
		String DBpassword = "tom@123";
		
		if(inputUsername.equals(DBusername) && inputPassword.equals(DBpassword)) {
			System.out.println("Credentials are valid");
			System.out.println("Welcome Tom!");
		}
		else {
			System.out.println("Username or password is not correct");
			System.out.println("Access denied");
		}
	}
	
	// Assignment: logical operators && , ||, !condition
//		1. create condition for matching username but different password
//		2. create condition for different username but matching password

}
