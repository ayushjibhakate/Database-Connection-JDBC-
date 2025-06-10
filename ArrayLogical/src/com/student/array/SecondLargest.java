package com.student.array;

public class SecondLargest {

	public static void main(String[] args) {

		int a[] = { 50, 50, 5, 10, 20 };
		int n = a.length;
		int temp = 0;
		int j = 1;
		;

		for (int i = 0; i < n; i++) {

			for (j = 1; j < n; j++) {

				if (a[j - 1] > a[j]) {

					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;

				}

			}
//			System.out.println("Maximum : " + a[j - 1]);

		}
		System.out.println("Maximum : " + temp);
		if (temp == a[j - 1]) {
			System.out.println("Second Largest : " + a[j - 2]);
		} else if (temp > a[j - 1] || temp != a[j - 1]) {
			System.out.println("minimum : " + a[j - 1]);
		}
	}

}
