package com.domain;

public class Sphere extends Shape3D {

	private double radius;

	public Sphere() {
		super("Sphere");
	}

	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return 4 * Math.PI * radius * radius;
	}

	@Override
	public double volume() {
		return (4.0 / 3.0) * Math.PI * radius * radius * radius;
	}

	@Override
	public String toString() {
		return "Sphere [Radius = " + radius + ", Surface Area = " + area() + ", Volume = " + volume() + "]";
	}
}