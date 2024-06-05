package com.tka.abstraction.abtraction_Example;

public class BankTansferPaymentProcess extends PaymentProcess {

	@Override
	public boolean processPayment() {
		System.out.println("Bank Transfer payment process");
		logTransaction();
		return true;
	}

	@Override
	public boolean validatePayment() {
		System.out.println("Bank Transfer Payment Validate");
		logTransaction();
		return true;
	}

	@Override
	public boolean initiatePayment() {
		System.out.println("Bank Transfer payment initiate");
		logTransaction();
		return true;
	}
}
