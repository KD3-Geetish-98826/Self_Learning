package com.domain;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int n = scanner.nextInt();

		int factorial = IntStream.rangeClosed(1, n)
				.reduce(1, (a, b) -> a * b);

		System.out.println("Factorial of " + n + " = " + factorial);
	}
}