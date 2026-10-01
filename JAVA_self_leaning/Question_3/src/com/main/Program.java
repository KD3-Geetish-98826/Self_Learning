package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.domain.Animal;
import com.domain.Elephant;
import com.domain.Enclosure;
import com.domain.Keeper;
import com.domain.Lion;
import com.domain.Tiger;
import com.domain.Zoo;

public class Program {

	static Scanner scanner = new Scanner(System.in);

	static List<Animal> animals = new ArrayList<>();
	static List<Enclosure> enclosures = new ArrayList<>();
	static List<Keeper> keepers = new ArrayList<>();

	static Zoo zoo = new Zoo(1, "City Zoo");

	public static void addLion() {

		System.out.print("\nEnter Animal ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Lion Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Age: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Mane Color: ");
		String color = scanner.nextLine();

		Animal animal = new Lion(id, name, age, color);

		animals.add(animal);
		zoo.addAnimal(animal);

		System.out.println("Lion Added Successfully!!");
	}

	public static void addTiger() {

		System.out.print("\nEnter Animal ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Tiger Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Age: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Stripe Pattern: ");
		String pattern = scanner.nextLine();

		Animal animal = new Tiger(id, name, age, pattern);

		animals.add(animal);
		zoo.addAnimal(animal);

		System.out.println("Tiger Added Successfully!!");
	}

	public static void addElephant() {

		System.out.print("\nEnter Animal ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Elephant Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Age: ");
		int age = scanner.nextInt();

		System.out.print("Enter Tusk Length: ");
		double tuskLength = scanner.nextDouble();

		Animal animal = new Elephant(id, name, age, tuskLength);

		animals.add(animal);
		zoo.addAnimal(animal);

		System.out.println("Elephant Added Successfully!!");
	}

	public static void printAnimals() {

		System.out.println("\n========== ALL ANIMALS ==========");

		for (Animal a : animals) {
			System.out.println(a);
		}
	}

	public static void findAnimal() {

		System.out.print("\nEnter Animal ID: ");
		int id = scanner.nextInt();

		Animal find = null;

		for (Animal a : animals) {

			if (id == a.getAnimalId()) {
				find = a;
				break;
			}
		}

		if (find != null) {
			System.out.println("\nAnimal Found!!");
			System.out.println(find);
		} else {
			System.out.println("\nAnimal Not Found!!");
		}
	}

	public static void makeAnimalSound() {

		System.out.print("\nEnter Animal ID: ");
		int id = scanner.nextInt();

		Animal find = null;

		for (Animal a : animals) {

			if (id == a.getAnimalId()) {
				find = a;
				break;
			}
		}

		if (find != null) {
			find.makeSound();
		} else {
			System.out.println("Animal Not Found!!");
		}
	}

	public static void addEnclosure() {

		System.out.print("\nEnter Enclosure ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Enclosure Name: ");
		String name = scanner.nextLine();

		Enclosure enclosure = new Enclosure(id, name);

		enclosures.add(enclosure);
		zoo.addEnclosure(enclosure);

		System.out.println("Enclosure Added Successfully!!");
	}

	public static void assignAnimalToEnclosure() {

		System.out.print("\nEnter Enclosure ID: ");
		int enclosureId = scanner.nextInt();

		Enclosure enclosure = null;

		for (Enclosure e : enclosures) {

			if (e.getEnclosureId() == enclosureId) {
				enclosure = e;
				break;
			}
		}

		if (enclosure == null) {
			System.out.println("Enclosure Not Found!!");
			return;
		}

		System.out.print("Enter Animal ID: ");
		int animalId = scanner.nextInt();

		Animal animal = null;

		for (Animal a : animals) {

			if (a.getAnimalId() == animalId) {
				animal = a;
				break;
			}
		}

		if (animal == null) {
			System.out.println("Animal Not Found!!");
			return;
		}

		enclosure.addAnimal(animal);

		System.out.println("Animal Assigned Successfully!!");
	}

	public static void printEnclosures() {

		System.out.println("\n========== ENCLOSURES ==========");

		for (Enclosure e : enclosures) {
			System.out.println(e);
		}
	}

	public static void addKeeper() {

		System.out.print("\nEnter Keeper ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Keeper Name: ");
		String name = scanner.nextLine();

		Keeper keeper = new Keeper(id, name);

		keepers.add(keeper);
		zoo.addKeeper(keeper);

		System.out.println("Keeper Added Successfully!!");
	}

	public static void assignKeeper() {

		System.out.print("\nEnter Keeper ID: ");
		int keeperId = scanner.nextInt();

		Keeper keeper = null;

		for (Keeper k : keepers) {

			if (k.getKeeperId() == keeperId) {
				keeper = k;
				break;
			}
		}

		if (keeper == null) {
			System.out.println("Keeper Not Found!!");
			return;
		}

		System.out.print("Enter Animal ID: ");
		int animalId = scanner.nextInt();

		Animal animal = null;

		for (Animal a : animals) {

			if (a.getAnimalId() == animalId) {
				animal = a;
				break;
			}
		}

		if (animal == null) {
			System.out.println("Animal Not Found!!");
			return;
		}

		keeper.setAssignedAnimal(animal);

		System.out.println("Keeper Assigned Successfully!!");
	}

	public static void printKeepers() {

		System.out.println("\n========== KEEPERS ==========");

		for (Keeper k : keepers) {
			System.out.println(k);
		}
	}

	public static int menuList() {

		System.out.println("\n========== ZOO MANAGEMENT SYSTEM ==========");
		System.out.println("0. Exit");
		System.out.println("1. Add Lion");
		System.out.println("2. Add Tiger");
		System.out.println("3. Add Elephant");
		System.out.println("4. Display Animals");
		System.out.println("5. Find Animal");
		System.out.println("6. Make Animal Sound");
		System.out.println("7. Add Enclosure");
		System.out.println("8. Assign Animal To Enclosure");
		System.out.println("9. Display Enclosures");
		System.out.println("10. Add Keeper");
		System.out.println("11. Assign Keeper");
		System.out.println("12. Display Keepers");
		System.out.print("Enter the Choice: ");

		return scanner.nextInt();
	}

	public static void main(String[] args) {

		int choice;

		while ((choice = menuList()) != 0) {

			switch (choice) {

			case 1:
				addLion();
				break;

			case 2:
				addTiger();
				break;

			case 3:
				addElephant();
				break;

			case 4:
				printAnimals();
				break;

			case 5:
				findAnimal();
				break;

			case 6:
				makeAnimalSound();
				break;

			case 7:
				addEnclosure();
				break;

			case 8:
				assignAnimalToEnclosure();
				break;

			case 9:
				printEnclosures();
				break;

			case 10:
				addKeeper();
				break;

			case 11:
				assignKeeper();
				break;

			case 12:
				printKeepers();
				break;

			default:
				System.out.println("Invalid Choice!!");
				break;
			}
		}
	}
}