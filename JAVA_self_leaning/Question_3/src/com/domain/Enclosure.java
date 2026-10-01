package com.domain;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {

	private int enclosureId;
	private String name;
	private List<Animal> animals;

	public Enclosure() {
		animals = new ArrayList<>();
	}

	public Enclosure(int enclosureId, String name) {
		this.enclosureId = enclosureId;
		this.name = name;
		this.animals = new ArrayList<>();
	}

	public int getEnclosureId() {
		return enclosureId;
	}

	public void setEnclosureId(int enclosureId) {
		this.enclosureId = enclosureId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public void removeAnimal(Animal animal) {
		animals.remove(animal);
	}

	@Override
	public String toString() {
		return "Enclosure ID: " + enclosureId + ", Name: " + name + ", Animals: " + animals;
	}
}