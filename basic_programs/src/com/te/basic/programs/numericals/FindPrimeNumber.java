package com.te.basic.programs.numericals;

import java.util.Scanner;

public class FindPrimeNumber {

	//prime number starts from 1 and divide by 1 and itself
	public static void main(String[] args) {

		System.out.println("Enter the Number:--");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.println("Prime Numbers between 1 And " + n );
	    for(int i = 2;i<n;i++) {
	    	
	    	boolean isPrime = true;
	    	for(int j = 2;j< i;j++) {
	    	
	    		if(i%j == 0) {
	    			isPrime = false;
	    			break;
	    		}
	    	}
	    	if(isPrime) {
	    		System.out.print(i);
	    	}
	    }
	}
	

}
