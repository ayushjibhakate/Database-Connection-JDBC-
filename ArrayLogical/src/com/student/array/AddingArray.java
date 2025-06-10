package com.student.array;

public class AddingArray {

	public static void main(String[] args) {

		int[] a = { 20, 10, 30, 40, 50, 60, 70, 80, 90 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println(a[i]);
		}

	}

}
