package com.student.array;

public class maxElement {
	
	public static void main(String[] args) {
		
		int [] a = {10, 20, 30, 40, 50, 60};
		
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i] > temp) {
				
				temp = a[i];
			}
			
		}
		System.out.println("Maximum Element : "+ temp);
		
		
	}
	
	
	

}
