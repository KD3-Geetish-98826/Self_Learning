package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.domain.Circle;
import com.domain.Cube;
import com.domain.Rectangle;
import com.domain.Shape;
import com.domain.Sphere;

public class Program {

	static Scanner scanner = new Scanner(System.in);

	static List<Shape> shapes = new ArrayList<>();

	public static void addCircle() {

		System.out.print("\nEnter Radius: ");
		double radius = scanner.nextDouble();

		Shape shape = new Circle(radius);

		shapes.add(shape);

		System.out.println("Circle Added Successfully!!");
	}

	public static void addRectangle() {

		System.out.print("\nEnter Length: ");
		double length = scanner.nextDouble();

		System.out.print("Enter Breadth: ");
		double breadth = scanner.nextDouble();

		Shape shape = new Rectangle(length, breadth);

		shapes.add(shape);

		System.out.println("Rectangle Added Successfully!!");
	}

	public static void addSphere() {

		System.out.print("\nEnter Radius: ");
		double radius = scanner.nextDouble();

		Shape shape = new Sphere(radius);

		shapes.add(shape);

		System.out.println("Sphere Added Successfully!!");
	}

	public static void addCube() {

		System.out.print("\nEnter Side: ");
		double side = scanner.nextDouble();

		Shape shape = new Cube(side);

		shapes.add(shape);

		System.out.println("Cube Added Successfully!!");
	}

	public static void printAllShapes() {

		System.out.println("\n========== ALL SHAPES ==========");

		for (Shape s : shapes) {
			System.out.println(s);
		}
	}

	public static void print2DShapes() {

		System.out.println("\n========== 2D SHAPES ==========");

		for (Shape s : shapes) {

			if (s instanceof Circle || s instanceof Rectangle) {
				System.out.println(s);
			}
		}
	}

	public static void print3DShapes() {

		System.out.println("\n========== 3D SHAPES ==========");

		for (Shape s : shapes) {

			if (s instanceof Sphere || s instanceof Cube) {
				System.out.println(s);
			}
		}
	}

	public static void calculateArea() {

		System.out.println("\n========== AREA ==========");

		for (Shape s : shapes) {
			System.out.println(s.getName() + " Area: " + s.area());
		}
	}

	public static void calculateVolume() {

		System.out.println("\n========== VOLUME ==========");

		for (Shape s : shapes) {

			if (s instanceof Sphere || s instanceof Cube) {
				System.out.println(s.getName() + " Volume: " + s.volume());
			}
		}
	}

	public static int menuList() {

		System.out.println("\n========== SHAPE MANAGEMENT SYSTEM ==========");
		System.out.println("0. Exit");
		System.out.println("1. Add Circle");
		System.out.println("2. Add Rectangle");
		System.out.println("3. Add Sphere");
		System.out.println("4. Add Cube");
		System.out.println("5. Display All Shapes");
		System.out.println("6. Display 2D Shapes");
		System.out.println("7. Display 3D Shapes");
		System.out.println("8. Calculate Area");
		System.out.println("9. Calculate Volume");
		System.out.print("Enter the Choice: ");

		return scanner.nextInt();
	}

	public static void main(String[] args) {

		int choice;

		while ((choice = menuList()) != 0) {

			switch (choice) {

			case 1:
				addCircle();
				break;

			case 2:
				addRectangle();
				break;

			case 3:
				addSphere();
				break;

			case 4:
				addCube();
				break;

			case 5:
				printAllShapes();
				break;

			case 6:
				print2DShapes();
				break;

			case 7:
				print3DShapes();
				break;

			case 8:
				calculateArea();
				break;

			case 9:
				calculateVolume();
				break;

			default:
				System.out.println("Invalid Choice!!");
				break;
			}
		}
	}
}