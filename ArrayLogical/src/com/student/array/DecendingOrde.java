package com.student.array;

public class DecendingOrde {

	public static void main(String[] args) {

		int a[] = { 50, 50, 5, 10, 20 };
		int n = a.length;

		for (int i = 0; i < n; i++) {

			for (int j = 1; j < n; j++) {

				if (a[j - 1] > a[j]) {

					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[i] = temp;

				}

			}

		}
		for (int i = 0; i < a.length; i++) {

			System.out.println("Incressing order : "+ a[i]);
		}
		System.out.println(" ----------------------------------  ");
		for (int i = n - 1; i > -1 ; i--) {

			System.out.println("Decressing order : "+ a[i]);
		}

	}

}
