package com.domain;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of integers: ");
		int n = scanner.nextInt();

		System.out.println("Enter " + n + " integers:");

		int sum = IntStream.range(0, n)
				.map(i -> scanner.nextInt())
				.sum();

		System.out.println("Sum = " + sum);
	}
}