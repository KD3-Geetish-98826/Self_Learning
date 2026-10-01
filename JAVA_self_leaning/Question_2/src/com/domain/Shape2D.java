package com.domain;

public abstract class Shape2D extends Shape {

	public Shape2D() {
		super();
	}

	public Shape2D(String name) {
		super(name);
	}

	@Override
	public double volume() {
		return 0;
	}
}