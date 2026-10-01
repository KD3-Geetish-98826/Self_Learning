package com.main;

import java.util.Scanner;

import com.exceptions.InsufficientStockException;
import com.exceptions.PaymentFailedException;
import com.exceptions.ShippingUnavailableException;

public class Program {

	public static Scanner scanner = new Scanner(System.in);

	public static void makePayment(double amount) throws PaymentFailedException {

		if (amount <= 0) {
			throw new PaymentFailedException("Invalid payment amount!!");
		}

		if (amount > 50000) {
			throw new PaymentFailedException("Payment failed!! Transaction limit exceeded.");
		}

		System.out.println("Payment successful!!");
	}

	public static void checkInventory(int quantity) throws InsufficientStockException {

		int availableStock = 10;

		if (quantity <= 0) {
			throw new InsufficientStockException("Invalid quantity!!");
		}

		if (quantity > availableStock) {
			throw new InsufficientStockException("Insufficient stock!! Available stock: " + availableStock);
		}

		System.out.println("Inventory available!!");
	}

	public static void shipOrder(String city) throws ShippingUnavailableException {

		if (city.equalsIgnoreCase("Pune") || city.equalsIgnoreCase("Mumbai") || city.equalsIgnoreCase("Delhi")) {

			System.out.println("Shipping available!!");
		} else {
			throw new ShippingUnavailableException("Shipping is not available in " + city);
		}
	}

	public static void main(String[] args) {

		System.out.print("Enter payment amount: ");
		double amount = scanner.nextDouble();

		System.out.print("Enter quantity: ");
		int quantity = scanner.nextInt();

		scanner.nextLine();

		System.out.print("Enter city: ");
		String city = scanner.nextLine();

		try {

			makePayment(amount);
			checkInventory(quantity);
			shipOrder(city);

			System.out.println("\nOrder placed successfully!!");

		} catch (PaymentFailedException e) {

			System.out.println("Payment Error: " + e.getMessage());

		} catch (InsufficientStockException e) {

			System.out.println("Inventory Error: " + e.getMessage());

		} catch (ShippingUnavailableException e) {

			System.out.println("Shipping Error: " + e.getMessage());
		}

		scanner.close();
	}
}