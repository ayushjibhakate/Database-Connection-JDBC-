package com.sorting;

public class SelectionSort {

	public static void selectionsorting(int arr[]) {

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int minValue = i;

			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[minValue]) {

					minValue = j;
				}

			}

			int temp = arr[minValue];
			arr[minValue] = arr[i];
			arr[i] = temp;
		}

	}

	public static void main(String[] args) {

		int a[] = { 10, 23, 56, 22, 33, 44, 25, 30 };
		int n = a.length;

		selectionsorting(a);

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ", ");

		}
	}

}
