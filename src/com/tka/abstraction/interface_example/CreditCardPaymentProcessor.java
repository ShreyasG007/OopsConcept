package com.tka.abstraction.interface_example;

public class CreditCardPaymentProcessor implements PaymentProcessor {

	@Override
	public boolean processPayment() {
		System.out.println("Credit Card payment process");
		return true;
	}

	@Override
	public boolean validatePayment() {
		System.out.println("Credit card Payment Validate");
		return true;
	}

	@Override
	public boolean initiatePayment() {
		System.out.println("Credit card payment initiate");
		return true;
	}

}
