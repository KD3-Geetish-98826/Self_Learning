package com.domain;

public class Rectangle extends Shape2D {

	private double length;
	private double breadth;

	public Rectangle() {
		super("Rectangle");
	}

	public Rectangle(double length, double breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double area() {
		return length * breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [Length = " + length + ", Breadth = " + breadth + ", Area = " + area() + "]";
	}
}