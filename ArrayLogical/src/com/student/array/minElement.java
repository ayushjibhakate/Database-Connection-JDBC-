package com.student.array;

import java.util.Iterator;

public class minElement {

	public static void main(String[] args) {

		int[] a = { 10, 120, 30, 8, 50 };

		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println(min);

	}

}
