package com.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int orderId;
	private List<Product> products;
	private double totalAmount;

	public Order() {
		products = new ArrayList<>();
	}

	public Order(int orderId, List<Product> products) {
		this.orderId = orderId;
		this.products = new ArrayList<>(products);
		calculateTotal();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
		calculateTotal();
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void calculateTotal() {

		totalAmount = 0;

		for (Product p : products) {
			totalAmount += p.getPrice() * p.getQuantity();
		}
	}

	@Override
	public String toString() {
		return "Order ID: " + orderId +
				", Total Amount: " + totalAmount +
				", Products: " + products;
	}
}