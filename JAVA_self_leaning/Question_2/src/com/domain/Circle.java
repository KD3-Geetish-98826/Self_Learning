package com.domain;

public class Circle extends Shape2D {

	private double radius;

	public Circle() {
		super("Circle");
	}

	public Circle(double radius) {
		super("Circle");
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
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [Radius = " + radius + ", Area = " + area() + "]";
	}
}