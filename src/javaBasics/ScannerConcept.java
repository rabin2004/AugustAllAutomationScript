package javaBasics;

import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("Provide first name: ");
//		String firstName = scan.nextLine(); // next() or nextLine() - expecting string values
//		System.out.print("Provide last name: ");
//		String lastName = scan.next();
//		scan.close();
//		
//		System.out.println("Welcome back "+firstName+" "+lastName+"!");
		
		
		String DBusername = "John123";
		String DBpassword = "12345";
		
		System.out.print("Enter username: ");
		String username = scan.next();
		System.out.print("Enter password: ");
		String password = scan.next();
		scan.close();
		
		if(username.equals(DBusername) && password.equals(DBpassword)) {
			System.out.println("Login successful");
			System.out.println("Welcome "+username+"!");
		}
		else {
			System.out.println("Provide valid username and password");
		}
	}
	//Assignment: Login application
//		1. created 2D - array for DB credentials
//		2. use Scanner to get input credentials
//		3. compare that input credentials with DB credentials in the array
//		4. validation

}
