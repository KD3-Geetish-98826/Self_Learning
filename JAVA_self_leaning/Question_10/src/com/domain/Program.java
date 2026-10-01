package com.domain;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Program {

	public static void main(String[] args) {

		IntStream strm = IntStream.rangeClosed(1, 10);

		System.out.println("Numbers from 1 to 10:");

		IntStream.rangeClosed(1, 10)
				.forEach(e -> System.out.print(e + " "));

		System.out.println();

		int sum = IntStream.rangeClosed(1, 10)
				.sum();

		System.out.println("\nSum = " + sum);

		IntSummaryStatistics stats = IntStream.rangeClosed(1, 10)
				.summaryStatistics();

		System.out.println("\nSummary Statistics:");
		System.out.println("Count  = " + stats.getCount());
		System.out.println("Sum    = " + stats.getSum());
		System.out.println("Min    = " + stats.getMin());
		System.out.println("Max    = " + stats.getMax());
		System.out.println("Average = " + stats.getAverage());
	}
}