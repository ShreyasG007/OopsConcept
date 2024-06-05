package com.tka.abstraction.abtraction_Example;

public abstract class PaymentProcess {
	public void logTransaction() {
		System.out.println("Log Transacted Successfully.");
	}
	public abstract boolean processPayment();
	public abstract boolean validatePayment();
	public abstract boolean initiatePayment();
	
}
