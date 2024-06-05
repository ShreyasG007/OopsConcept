package com.tka.runTImePolymorphism;

public class Test2 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		IciciBank icici = new IciciBank();
		SbiBank sbi = new SbiBank();
		Bank bank2 =new SbiBank();
		
		bank.basicInterestRate();
		icici.basicInterestRate();
		sbi.basicInterestRate();
		
		bank2.basicInterestRate();
	//	bank2.Loan();
		sbi.Loan();
		
		
	}
}
