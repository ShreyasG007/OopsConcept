package com.tka.abstraction.interface_example;

public class Test {
	public static void main(String[] args) {
		PaymentProcessor processor = new CreditCardPaymentProcessor();
		PaymentProcessor processor2 = new PayPalPaymentProcessor();
		PaymentProcessor processor3 = new BankTransferPaymentProcessor();
		
		processor.processPayment();
		processor.validatePayment();
		processor.initiatePayment();
		
		System.out.println();
		
		processor2.processPayment();
		processor2.validatePayment();
		processor2.initiatePayment();
		
		System.out.println();
		
		processor3.processPayment();
		processor3.validatePayment();
		processor3.initiatePayment();
	}
}
