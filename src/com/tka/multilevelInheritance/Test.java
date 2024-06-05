package com.tka.multilevelInheritance;

public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager("Shreyas", 25, 1, "Engineer", 850000, "DevOps Engineer", 20);

		manager.displayInfo();
		System.out.println();
		manager.displayEmployee();
		System.out.println();
		manager.display();
	}
}
