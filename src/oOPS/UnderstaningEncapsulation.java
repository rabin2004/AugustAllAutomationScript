package oOPS;

import java.util.Scanner;

public class UnderstaningEncapsulation {

	public static void main(String[] args) {
		
		EncapsulationConcept ec = new EncapsulationConcept();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Provide SSN: ");
		String social = scan.next();
		
		ec.setSSN(social);
		
		System.out.println(ec.getSSN());
		
		System.out.print("Provide DOB: ");
		String birthDay = scan.next();
		
		ec.setDOB(birthDay);
		
		System.out.println(ec.getDOB());
		
		
		System.out.println("***************************");
		System.out.println("Your SSN is "+ec.getSSN()+". And your DOB is "+ec.getDOB());
		System.out.println("***************************");
		

	}

}
