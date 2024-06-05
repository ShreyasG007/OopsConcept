package com.tka.encapsulation;

import com.tka.utility.ObjectValidation;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();

		student.setRollNo(-2);
		student.setName("Shreyas");

		boolean isRollNo = ObjectValidation.rollNoValidation(student);
		boolean isNameValid = ObjectValidation.nameValidation(student);
		
		String msg = ObjectValidation.studentValidation(student);

		if (!isNameValid || !isRollNo) {
			if (!isNameValid && isRollNo) {
				System.out.println("Name Invalid");
			} else if (!isRollNo && isNameValid) {
				System.out.println("Roll No Invalid");
			} else {
				System.out.println("Name and Roll No both invalid");
			}
		}

		else {
			System.out.println("Roll No : " + student.getRollNo());
			System.out.println("Name : " + student.getName());
		}
		
		//By using String
		if(msg != null) {
			System.out.println(msg);
		}
		else {
			System.out.println(student);
		}

	}
}
