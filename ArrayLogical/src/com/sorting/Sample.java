package com.sorting;

class Test extends Thread { 
public void run() 
    { 
        System.out.println("Run"); 
    } 
}
 class Myclass { 

public static void main(String[] args) 
    { 
        Test t = new Test(); 
        t.run(); 
    } 
} 