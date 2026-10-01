package com.domain;

public class Tiger extends Animal {

	private String stripePattern;

	public Tiger() {
		super();
	}

	public Tiger(int animalId, String name, int age, String stripePattern) {
		super(animalId, name, age);
		this.stripePattern = stripePattern;
	}

	public String getStripePattern() {
		return stripePattern;
	}

	public void setStripePattern(String stripePattern) {
		this.stripePattern = stripePattern;
	}

	@Override
	public void makeSound() {
		System.out.println("Tiger growls");
	}

	@Override
	public String toString() {
		return "Tiger [" + super.toString() + ", Stripe Pattern: " + stripePattern + "]";
	}
}