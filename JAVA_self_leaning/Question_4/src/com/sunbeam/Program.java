package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the day: ");
		String input = scanner.next().toUpperCase();

		try {
			Day day = Day.valueOf(input);

			System.out.println("Day : " + day);
			System.out.println("Is Weekend : " + day.isWeekend());
			System.out.println("Is Weekday : " + day.isWeekday());

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid Day!!");
		}

		scanner.close();
	}
}