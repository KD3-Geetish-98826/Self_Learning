package com.sunbeam;

public class Program {

	public static <T extends Number> double findMin(T[] arr) {

		double min = arr[0].doubleValue();

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].doubleValue() < min) {
				min = arr[i].doubleValue();
			}
		}

		return min;
	}

	public static void main(String[] args) {

		Integer[] arr1 = { 40, 10, 50, 20, 30 };

		Double[] arr2 = { 4.5, 2.3, 8.7, 1.2, 6.4 };

		Float[] arr3 = { 5.5f, 2.2f, 9.8f, 1.1f };

		System.out.println("Minimum Integer = " + findMin(arr1));
		System.out.println("Minimum Double  = " + findMin(arr2));
		System.out.println("Minimum Float   = " + findMin(arr3));
	}
}