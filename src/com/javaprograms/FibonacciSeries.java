package com.javaprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of FibonacciSeries want to print");
		int a = 0, b = 1, c, seriesCount = sc.nextInt();
		System.out.println(a);
		System.out.println(b);

		if (seriesCount <= 1) {
			System.out.println("Please provide the count of more that 5");
			seriesCount = sc.nextInt();
		} else {
			for (int i = 2; i < seriesCount; i++) {
				c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}
		}
	}

	// Print *
	// *
//	**
//	***
//	Print * 1 * 12 * 123 * 1234 *
//	find duplicates in an array
//	merge two arrays

}
