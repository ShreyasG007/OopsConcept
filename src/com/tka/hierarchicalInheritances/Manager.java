package com.tka.hierarchicalInheritances;

public class Manager extends Person{
	private String team;
	private int teamSize;

	public Manager() {

	}

	public Manager(String name, int age, String team, int teamSize) {
		super(name, age);
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

	public void displayManagerInfo() {
		System.out.println("Manager Information");
		System.out.println("Name : "+getName());
		System.out.println("Age : "+getAge());
		System.out.println("TeamName : "+team);
		System.out.println("TeamSize : "+teamSize);
	}
	


}
