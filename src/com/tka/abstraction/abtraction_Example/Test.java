package com.tka.abstraction.abtraction_Example;

public class Test {
	public static void main(String[] args) {
		PaymentProcess process = new CreditCardPaymentProcessor();
		PaymentProcess paypalProcess = new PayPalPAymentProcessor();
		PaymentProcess bankProcess = new BankTansferPaymentProcess();
		
		
		
		System.out.println("********Credit card********");
		process.processPayment();
		System.out.println();
		process.initiatePayment();
		System.out.println();
		process.validatePayment();
		System.out.println();
		System.out.println("********PayPal********");
		paypalProcess.processPayment();
		System.out.println();
		paypalProcess.initiatePayment();
		System.out.println();
		paypalProcess.validatePayment();
		System.out.println();
		System.out.println("********Bank Transfer********");
		bankProcess.processPayment();
		System.out.println();
		bankProcess.initiatePayment();
		System.out.println();
		bankProcess.validatePayment();
	}
}
