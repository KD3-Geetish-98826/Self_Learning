package com.domain;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private int zooId;
	private String zooName;

	private List<Animal> animals;
	private List<Enclosure> enclosures;
	private List<Keeper> keepers;

	public Zoo() {
		animals = new ArrayList<>();
		enclosures = new ArrayList<>();
		keepers = new ArrayList<>();
	}

	public Zoo(int zooId, String zooName) {
		this.zooId = zooId;
		this.zooName = zooName;
		this.animals = new ArrayList<>();
		this.enclosures = new ArrayList<>();
		this.keepers = new ArrayList<>();
	}

	public int getZooId() {
		return zooId;
	}

	public void setZooId(int zooId) {
		this.zooId = zooId;
	}

	public String getZooName() {
		return zooName;
	}

	public void setZooName(String zooName) {
		this.zooName = zooName;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public List<Enclosure> getEnclosures() {
		return enclosures;
	}

	public List<Keeper> getKeepers() {
		return keepers;
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public void addEnclosure(Enclosure enclosure) {
		enclosures.add(enclosure);
	}

	public void addKeeper(Keeper keeper) {
		keepers.add(keeper);
	}

	@Override
	public String toString() {
		return "Zoo ID: " + zooId + ", Zoo Name: " + zooName;
	}
}