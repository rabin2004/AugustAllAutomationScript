package testPkg;

import java.util.Scanner;

public class BOAnyc implements BOAusa {
	
	public void nycRules() {
		
	}
	
	public void debitAccMtaCard() {
		
	}

	public static void main(String[] args) {
		BOAnyc nyc = new BOAnyc();
		
		// customer
		nyc.checkingAcc();
		nyc.morgageLoan();
		
		PersonalInformation pi = new PersonalInformation();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First name: ");
		pi.setFirstName(scan.next());
		
		System.out.print("Last name: ");
		pi.setLastName(scan.next());
		
		System.out.print("SSN: ");
		pi.setSsn(scan.next());
		
		System.out.println("DOB: ");
		pi.setDob(scan.next());
		
		System.out.println("Email: ");
		pi.setEmailID(scan.next());
		
		System.out.println("Mobile Number: ");
		pi.setContactNumber(scan.next());
		
		scan.close();
		
		System.out.println("Welcome "+pi.getFirstName()+" "+pi.getLastName()+" to BOA family!");
		

	}

	@Override
	public void northAmericanRules() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debitCardVisa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debitCardMasterCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creditCardVisa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creditCardMasterCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void personalLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkingAccountZeroBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void savingAccountMinimum500() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debitCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creditCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkingAcc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void savingAcc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void morgageLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void globalHeadOfficeRules() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void USArules() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void boatLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void businessLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onlineAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mobileAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void equities() {
		// TODO Auto-generated method stub
		
	}

}
