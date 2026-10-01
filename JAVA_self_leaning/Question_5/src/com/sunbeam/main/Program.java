package com.sunbeam.main;

import java.util.Scanner;

import com.subeam.domain.TextAnalyzer;


public class Program {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the text: ");
		String text = scanner.nextLine();

		TextAnalyzer analyzer = new TextAnalyzer(text);

		analyzer.printStatistics();

		scanner.close();
	}
}