package com.student.array;

public class AverageElement {
	
	public static void main(String[] args) {
		
		int a[] = { 5, 10, 15, 20 } ;
		
		int n = a.length;
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
			 sum += a[i] ; 
		}
		System.out.println("The Sum is : "+ sum);
		double  avg = sum / n;
		System.out.println("Average is : "+ avg);
		
	}

}
