package com.tka.abstraction.interface_example;

public class PayPalPaymentProcessor implements PaymentProcessor {

	@Override
	public boolean processPayment() {
		System.out.println("PayPal payment process");
		return true;
	}

	@Override
	public boolean validatePayment() {
		System.out.println("PayPal Payment Validate");
		return true;
	}

	@Override
	public boolean initiatePayment() {
		System.out.println("PayPal payment initiate");
		return true;
	}

}
