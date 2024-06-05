package com.tka.abstraction.abtraction_Example;

public class PayPalPAymentProcessor extends PaymentProcess {

	@Override
	public boolean processPayment() {
		System.out.println("PayPal payment process");
		logTransaction();
		return true;
	}

	@Override
	public boolean validatePayment() {
		System.out.println("PayPal Payment Validate");
		logTransaction();
		return true;
	}

	@Override
	public boolean initiatePayment() {
		System.out.println("PayPal payment initiate");
		logTransaction();
		return true;
	}


}
