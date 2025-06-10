package com.student.array;

public class CountEvenAndOdd {
	
	public static void main(String[] args) {
		
		int a[] = { 10, 21, 32, 43, 54, 65 } ;
		int countEven = 0;
		int countOdd = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i] % 2 == 0) {
				countEven++;
			}
			else if (a[i] % 2 != 0) {
				countOdd++;
				
			}
			
		}
		System.out.println("Event Number is : "+ countEven);
		System.out.println("Odd Number is : "+ countOdd);
	}

}
