package com.domain;

public class Cube extends Shape3D {

	private double side;

	public Cube() {
		super("Cube");
	}

	public Cube(double side) {
		super("Cube");
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return 6 * side * side;
	}

	@Override
	public double volume() {
		return side * side * side;
	}

	@Override
	public String toString() {
		return "Cube [Side = " + side + ", Surface Area = " + area() + ", Volume = " + volume() + "]";
	}
}