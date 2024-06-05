package com.tka.hierarchicalInheritances;



public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager("Shreyas", 25, "Dev Team", 25);
		manager.displayManagerInfo();
		System.out.println();
		manager.displayPersonInfo();
		System.out.println();
		
		StudentInfo studentInfo = new StudentInfo("Raj", 25, 21, 87.25);
		studentInfo.displayStudentInfo();
		System.out.println();
		studentInfo.displayPersonInfo();
		System.out.println();
		
		Employee employee= new Employee("Gaurav", 25, 1, "IT", 200000);
		employee.displayEmployeeInfo();
		System.out.println();
		employee.displayPersonInfo();
	}
}
