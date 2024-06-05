package com.tka.utility;

import com.tka.encapsulation.Student;

public class ObjectValidation {
	public static boolean rollNoValidation(Student student) {
		boolean isRollNoValid = true;

		if (student.getRollNo() <= 0) {
			isRollNoValid = false;
		}
		return isRollNoValid;

	}

	public static boolean nameValidation(Student student) {
		boolean isNameValid = true;

		if (student.getName().length() < 3 || student.getName() == null) {
			isNameValid = false;
		}
		return isNameValid;

	}

	public static String studentValidation(Student student) {
		String msg = "";
		if (student.getRollNo() <= 0) {
			msg = msg + "Invalid Roll No";
		}
		if (student.getName().length() < 3 || student.getName() == null) {
			msg = msg + "\nInvalid Name";
		}

		return msg;
	}
}
