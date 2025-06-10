package com.sorting;

public class BubbleSort {

	static void bubbleSort(int[] arr) {
		
		
		int n = arr.length;
		int temp = 0;
		
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 1; j < n; j++) {

				if (arr[j - 1] > arr[j]) {

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}

		}

	}

	public static void main(String[] args) {
		
		int a[] = { 10, 99, 56, 12, 54, 63, 45 };

		bubbleSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	}

}
