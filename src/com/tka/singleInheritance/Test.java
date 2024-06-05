package com.tka.singleInheritance;

public class Test {
	public static void main(String[] args) {
		Employee employee = new Employee("Shreyas", 25, 1, "Engineer", 850000);
		employee.displayEmployee();
		System.out.println();
		employee.setName("Rajat");
		employee.displayEmployee();
		System.out.println();
		employee.display();
		
	}
}
