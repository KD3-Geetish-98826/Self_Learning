package com.domain;

public class Elephant extends Animal {

	private double tuskLength;

	public Elephant() {
		super();
	}

	public Elephant(int animalId, String name, int age, double tuskLength) {
		super(animalId, name, age);
		this.tuskLength = tuskLength;
	}

	public double getTuskLength() {
		return tuskLength;
	}

	public void setTuskLength(double tuskLength) {
		this.tuskLength = tuskLength;
	}

	@Override
	public void makeSound() {
		System.out.println("Elephant trumpets");
	}

	@Override
	public String toString() {
		return "Elephant [" + super.toString() + ", Tusk Length: " + tuskLength + "]";
	}
}