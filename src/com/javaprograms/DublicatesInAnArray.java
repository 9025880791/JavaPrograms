package com.javaprograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DublicatesInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int sizeOfAnArray = sc.nextInt();
		int[] arr = new int[sizeOfAnArray];
		System.out.println("Enter the " + sizeOfAnArray + " number with duplicate");
		for (int i = 0; i < sizeOfAnArray; i++) {
			arr[i] = sc.nextInt();
		}

		Set<Integer> dup = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					dup.add(arr[j]);
				} 
			}
		}
		System.out.println("Dublicate array values = " + dup);
	}
}
