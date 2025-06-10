package com.student.array;

public class ReverseElement {
	
	public static void main(String[] args) {
		
		int a[] = { 5, 10, 15, 20 } ;
		
		int n = a.length;
		
		System.out.println("Reverse Element is : ");
		for (int i = n-1 ; i > -1 ; i--) {
			
			System.out.println( a[i]);
			
		}
		
	}

}
