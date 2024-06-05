package com.tka.abstraction.abtraction_Example;

public class CreditCardPaymentProcessor extends PaymentProcess{
	@Override
	public boolean processPayment() {
		System.out.println("Credit Card payment process");
		logTransaction();
		return true;
	}

	@Override
	public boolean validatePayment() {
		
		System.out.println("Credit card Payment Validate");
		logTransaction();
		return true;
	}

	@Override
	public boolean initiatePayment() {
		
		System.out.println("Credit card payment initiate");
		logTransaction();
		return true;
	}

}
