package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("deposit percentage is 5%");
		System.out.println("Pushparaj deposit percentage is 10%");
		System.out.println("Pushparaj Fixed deposit percentage is 12%");
		System.out.println("Nanda Fixed deposit percentage is 10%");
		
	}
	
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.deposit();
		a.saving();
		a.fixed();
	}

}
