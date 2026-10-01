package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class Student {

	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student() {
	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Roll: " + roll + ", Name: " + name + ", City: " + city + ", Marks: " + marks;
	}
}

public class Program {

	public static void main(String[] args) {

		Student[] students = {
				new Student(1, "Rahul", "Pune", 85.5),
				new Student(2, "Amit", "Mumbai", 90.5),
				new Student(3, "Geetish", "Pune", 90.5),
				new Student(4, "Karan", "Mumbai", 85.5),
				new Student(5, "Rohit", "Pune", 90.5),
				new Student(6, "Akash", "Mumbai", 90.5)
		};

		System.out.println("Before Sorting:");

		for (Student s : students) {
			System.out.println(s);
		}

		Arrays.sort(students,
				(s1, s2) -> {

					int result = s2.getCity().compareTo(s1.getCity());

					if (result == 0) {
						result = Double.compare(s2.getMarks(), s1.getMarks());
					}

					if (result == 0) {
						result = s1.getName().compareTo(s2.getName());
					}

					return result;
				});

		System.out.println("\nAfter Sorting:");

		for (Student s : students) {
			System.out.println(s);
		}
	}
}