package com.tka.singleInheritance;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

}
