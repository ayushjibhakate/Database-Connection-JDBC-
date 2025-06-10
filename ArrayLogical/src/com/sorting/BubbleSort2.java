package com.sorting;

public class BubbleSort2 {

	private static void bubblesort(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {

			for (int j = 1; j < n; j++) {

				if (arr[j - 1] > arr[j]) {

					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}

		}

	}

	public static void main(String[] args) {

		int arr[] = { 20, 56, 45, 35, 20, 36, 45 };

		bubblesort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
