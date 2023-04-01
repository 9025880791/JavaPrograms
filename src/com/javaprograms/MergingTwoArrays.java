package com.javaprograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MergingTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first Array");
		int firstArraySize = sc.nextInt();
		int[] array1 = new int[firstArraySize];
		System.out.println("Enter the size of second Array");
		int secondArraySize = sc.nextInt();
		int[] array2 = new int[secondArraySize];
		int[] array3 = new int[array1.length + array2.length];

		System.out.println("Enter the "+firstArraySize+" number for first Array");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}

		System.out.println("Enter the "+secondArraySize+" number for first Array");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}

		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			array3[i + array1.length] = array2[i];
		}

		System.out.println("Merged array value = " + Arrays.toString(array3));

	}
}
