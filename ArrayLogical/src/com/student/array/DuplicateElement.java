package com.student.array;

public class DuplicateElement {

	public static void main(String[] args) {

		int a[] = { 50, 40, 50, 10, 10 };

		int n = a.length;

		int temp = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 1; j < n; j++) {

				if (a[j - 1] == a[j]) {
					
					temp = a[j];
					System.out.println(temp);

				}

			}

		}

	}

}
