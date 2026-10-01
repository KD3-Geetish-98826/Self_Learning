package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.domain.Order;
import com.domain.Product;


public class Program {

	public static Scanner scanner = new Scanner(System.in);

	static Map<Integer, Product> products = new HashMap<>();
	static List<Order> orderHistory = new ArrayList<>();

	static int orderId = 1;

	public static void addProduct() {

		System.out.print("\nEnter Product ID: ");
		int id = scanner.nextInt();

		if (products.containsKey(id)) {
			System.out.println("Product already exists!!");
			return;
		}

		scanner.nextLine();

		System.out.print("Enter Product Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Product Price: ");
		double price = scanner.nextDouble();

		System.out.print("Enter Product Quantity: ");
		int quantity = scanner.nextInt();

		Product product = new Product(id, name, price, quantity);

		products.put(id, product);

		System.out.println("Product added successfully!!");
	}

	public static void displayProducts() {

		if (products.isEmpty()) {
			System.out.println("No products available!!");
			return;
		}

		System.out.println("\n========== PRODUCTS ==========");

		for (Product p : products.values()) {
			System.out.println(p);
		}
	}

	public static void findProduct() {

		System.out.print("\nEnter Product ID: ");
		int id = scanner.nextInt();

		Product product = products.get(id);

		if (product != null) {
			System.out.println(product);
		} else {
			System.out.println("Product not found!!");
		}
	}

	public static void removeProduct() {

		System.out.print("\nEnter Product ID: ");
		int id = scanner.nextInt();

		Product product = products.remove(id);

		if (product != null) {
			System.out.println("Product removed successfully!!");
		} else {
			System.out.println("Product not found!!");
		}
	}

	public static void updateProduct() {

		System.out.print("\nEnter Product ID: ");
		int id = scanner.nextInt();

		Product product = products.get(id);

		if (product == null) {
			System.out.println("Product not found!!");
			return;
		}

		System.out.println("\n0. Exit");
		System.out.println("1. Update Name");
		System.out.println("2. Update Price");
		System.out.println("3. Update Quantity");

		System.out.print("Enter choice: ");
		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			scanner.nextLine();
			System.out.print("Enter new name: ");
			String name = scanner.nextLine();

			product.setName(name);

			System.out.println("Name updated successfully!!");
			break;

		case 2:
			System.out.print("Enter new price: ");
			double price = scanner.nextDouble();

			product.setPrice(price);

			System.out.println("Price updated successfully!!");
			break;

		case 3:
			System.out.print("Enter new quantity: ");
			int quantity = scanner.nextInt();

			product.setQuantity(quantity);

			System.out.println("Quantity updated successfully!!");
			break;

		case 0:
			break;

		default:
			System.out.println("Invalid choice!!");
			break;
		}
	}

	public static void placeOrder() {

		if (products.isEmpty()) {
			System.out.println("No products available!!");
			return;
		}

		List<Product> orderProducts = new ArrayList<>();

		while (true) {

			System.out.print("\nEnter Product ID: ");
			int id = scanner.nextInt();

			Product product = products.get(id);

			if (product == null) {
				System.out.println("Product not found!!");
				continue;
			}

			System.out.print("Enter quantity: ");
			int quantity = scanner.nextInt();

			if (quantity <= 0) {
				System.out.println("Invalid quantity!!");
				continue;
			}

			if (quantity > product.getQuantity()) {
				System.out.println("Insufficient stock!!");
				continue;
			}

			Product orderProduct = new Product(
					product.getProductId(),
					product.getName(),
					product.getPrice(),
					quantity
			);

			orderProducts.add(orderProduct);

			product.setQuantity(product.getQuantity() - quantity);

			System.out.print("Add another product? (y/n): ");
			String choice = scanner.next();

			if (choice.equalsIgnoreCase("n")) {
				break;
			}
		}

		if (!orderProducts.isEmpty()) {

			Order order = new Order(orderId++, orderProducts);

			orderHistory.add(order);

			System.out.println("\nOrder placed successfully!!");
			System.out.println(order);
		}
	}

	public static void displayOrderHistory() {

		if (orderHistory.isEmpty()) {
			System.out.println("No orders available!!");
			return;
		}

		System.out.println("\n========== ORDER HISTORY ==========");

		for (Order order : orderHistory) {
			System.out.println(order);
		}
	}

	public static int menuList() {

		System.out.println("\n========== SHOPPING CART ==========");
		System.out.println("0. Exit");
		System.out.println("1. Add Product");
		System.out.println("2. Display Products");
		System.out.println("3. Find Product");
		System.out.println("4. Remove Product");
		System.out.println("5. Update Product");
		System.out.println("6. Place Order");
		System.out.println("7. Order History");

		System.out.print("Enter choice: ");

		return scanner.nextInt();
	}

	public static void main(String[] args) {

		int choice;

		while ((choice = menuList()) != 0) {

			switch (choice) {

			case 1:
				addProduct();
				break;

			case 2:
				displayProducts();
				break;

			case 3:
				findProduct();
				break;

			case 4:
				removeProduct();
				break;

			case 5:
				updateProduct();
				break;

			case 6:
				placeOrder();
				break;

			case 7:
				displayOrderHistory();
				break;

			default:
				System.out.println("Invalid choice!!");
				break;
			}
		}

		scanner.close();
	}
}