package com.tka.compileTimePolymorphism;

public class Calculator {
	public void Addition(int a, int b) {
		System.out.println("int + int : " + (a + b));
	}

	public void Addition(int a, float b) {
		System.out.println("int + float : " + (a + b));
	}

	public void Addition(int a, double b) {
		System.out.println("int + double : " + (a + b));
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		calculator.Addition(10, 20.0f);
		calculator.Addition(10, 20);
		calculator.Addition(10, 20.0);
	}
}
