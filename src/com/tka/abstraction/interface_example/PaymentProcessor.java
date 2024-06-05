package com.tka.abstraction.interface_example;

public interface PaymentProcessor {
	public abstract boolean processPayment();
	public abstract boolean validatePayment();
	public abstract boolean initiatePayment();
}
