package com.domain;

public class Keeper {

	private int keeperId;
	private String name;
	private Animal assignedAnimal;

	public Keeper() {
	}

	public Keeper(int keeperId, String name) {
		this.keeperId = keeperId;
		this.name = name;
	}

	public int getKeeperId() {
		return keeperId;
	}

	public void setKeeperId(int keeperId) {
		this.keeperId = keeperId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAssignedAnimal() {
		return assignedAnimal;
	}

	public void setAssignedAnimal(Animal assignedAnimal) {
		this.assignedAnimal = assignedAnimal;
	}

	@Override
	public String toString() {
		return "Keeper ID: " + keeperId + ", Name: " + name + ", Assigned Animal: " + assignedAnimal;
	}
}