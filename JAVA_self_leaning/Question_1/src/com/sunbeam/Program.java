package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.Student;

public class Program {

	static Scanner scanner = new Scanner(System.in);
	static List<Student> students = new ArrayList<>();

	public static void acceptRecord() {

		System.out.print("\nEnter Roll No: ");
		int rollNo = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter Student Name: ");
		String name = scanner.nextLine();

		Student student = new Student(rollNo, name);

		System.out.print("Enter number of subjects: ");
		int n = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter Subject " + (i + 1) + ": ");
			String subject = scanner.nextLine();
			student.addSubject(subject);
		}

		students.add(student);

		System.out.println("\nStudent added successfully!");
	}

	public static void printAllStudents() {

		for (Student s : students) {
			System.out.println(s);
		}
	}

	public static void demonstrateConstructors() {

		System.out.println("\nDefault Constructor");

		Student s1 = new Student();
		System.out.println(s1);

		System.out.println("\nParameterized Constructor");

		Student s2 = new Student(101, "Geetish");
		s2.addSubject("Java");
		s2.addSubject("DBT");
		System.out.println(s2);

		System.out.println("\nParameterized Constructor with List");

		List<String> subjects = new ArrayList<>();
		subjects.add("C++");
		subjects.add("MongoDB");

		Student s3 = new Student(102, "Rahul", subjects);
		System.out.println(s3);

		System.out.println("\nCopy Constructor");

		Student s4 = new Student(s3);
		System.out.println(s4);
	}

	public static void demonstrateShallowCopy() {

		Student original = new Student(101, "Geetish");

		original.addSubject("Java");
		original.addSubject("MySQL");

		Student shallow = original.shallowCopy();

		System.out.println("\nBefore Modification");

		System.out.println("Original : " + original);
		System.out.println("Shallow  : " + shallow);

		shallow.addSubject("MongoDB");

		System.out.println("\nAfter Modification");

		System.out.println("Original : " + original);
		System.out.println("Shallow  : " + shallow);
	}

	public static void demonstrateDeepCopy() {

		Student original = new Student(102, "Rahul");

		original.addSubject("Java");
		original.addSubject("Spring");

		Student deep = original.deepCopy();

		System.out.println("\nBefore Modification");

		System.out.println("Original : " + original);
		System.out.println("Deep     : " + deep);

		deep.addSubject("Hibernate");

		System.out.println("\nAfter Modification");

		System.out.println("Original : " + original);
		System.out.println("Deep     : " + deep);
	}

	public static int menuList() {

		System.out.println("\n========== STUDENT INFORMATION SYSTEM ==========");
		System.out.println("0. Exit");
		System.out.println("1. Add Student");
		System.out.println("2. Display Students");
		System.out.println("3. Demonstrate Constructors");
		System.out.println("4. Demonstrate Shallow Copy");
		System.out.println("5. Demonstrate Deep Copy");
		System.out.print("Enter the choice: ");

		return scanner.nextInt();
	}

	public static void main(String[] args) {

		int choice;

		while ((choice = menuList()) != 0) {

			switch (choice) {

			case 1:
				acceptRecord();
				break;

			case 2:
				printAllStudents();
				break;

			case 3:
				demonstrateConstructors();
				break;

			case 4:
				demonstrateShallowCopy();
				break;

			case 5:
				demonstrateDeepCopy();
				break;

			default:
				System.out.println("Invalid Choice!!");
				break;
			}
		}
	}
}