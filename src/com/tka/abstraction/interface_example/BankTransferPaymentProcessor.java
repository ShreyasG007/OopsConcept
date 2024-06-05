package com.tka.abstraction.interface_example;

public class BankTransferPaymentProcessor implements PaymentProcessor {

	@Override
	public boolean processPayment() {
		System.out.println("Bank Transfer payment process");
		return true;
	}

	@Override
	public boolean validatePayment() {
		System.out.println("Bank Transfer Payment Validate");
		return true;
	}

	@Override
	public boolean initiatePayment() {
		System.out.println("Bank Transfer payment initiate");
		return true;
	}

}
