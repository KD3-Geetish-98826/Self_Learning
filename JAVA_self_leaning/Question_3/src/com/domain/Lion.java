package com.domain;

public class Lion extends Animal {

	private String maneColor;

	public Lion() {
		super();
	}

	public Lion(int animalId, String name, int age, String maneColor) {
		super(animalId, name, age);
		this.maneColor = maneColor;
	}

	public String getManeColor() {
		return maneColor;
	}

	public void setManeColor(String maneColor) {
		this.maneColor = maneColor;
	}

	@Override
	public void makeSound() {
		System.out.println("Lion roars");
	}

	@Override
	public String toString() {
		return "Lion [" + super.toString() + ", Mane Color: " + maneColor + "]";
	}
}