package com.student.array;

import java.util.Iterator;

public class AsendingElement {

	public static void main(String[] args) {

		int a[] = { 50, 50, 5, 10, 20 };
		int n = a.length;
		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < a.length; j++) {

				if (a[j - 1] > a[j]) {

					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;

				}

			}

		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}

	}

}
