package com.tka.runTImePolymorphism;

public class SbiBank extends Bank{
	@Override
	public void basicInterestRate() {
		System.out.println("SBI Bank interest rate : 10 %");
	}
	
	public void Loan() {
		System.out.println("Loan Department");
	}
}

