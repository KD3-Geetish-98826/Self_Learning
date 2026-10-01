package com.domain;

public abstract class Animal {

	private int animalId;
	private String name;
	private int age;

	public Animal() {
	}

	public Animal(int animalId, String name, int age) {
		this.animalId = animalId;
		this.name = name;
		this.age = age;
	}

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
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

	public abstract void makeSound();

	@Override
	public String toString() {
		return "Animal ID: " + animalId + ", Name: " + name + ", Age: " + age;
	}
}