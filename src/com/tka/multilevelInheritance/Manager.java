package com.tka.multilevelInheritance;

public class Manager extends Employee {
	private String team;
	private int teamSize;

	public Manager() {

	}

	public Manager(String name, int age, int id, String department, double salary, String team, int teamSize) {
		super(name, age, id, department, salary);
		this.team = team;
		this.teamSize = teamSize;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public void displayInfo() {
		System.out.println("Id : " + getId());
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Department : " + getDepartment());
		System.out.println("Salary : " + getSalary());
		System.out.println("Team name : " + team);
		System.out.println("Team Size : " + teamSize);
	}

}
