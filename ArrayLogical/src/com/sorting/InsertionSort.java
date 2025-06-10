package com.sorting;

public class InsertionSort {
	
	public static void insertionSort ( int arr[] ) {
		 
		int n = arr.length;
		
		for (int i = 1; i < n; i++) {
			
			int key = arr[ i ];
			int a = i - 1;
			
			
			while((a > -1) && arr [a] > key ) {
				arr [a + 1] = arr[a];
				
				a--;
			}
			arr [a + 1] = key ;
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int a[] = { 10, 23, 56, 22, 33, 44, 25, 30 }; 
		
		insertionSort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", "); 
		}
		
		
	}

}
