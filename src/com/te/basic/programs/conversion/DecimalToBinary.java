package com.te.basic.programs.conversion;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter the Number: --");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int placeValue = 1;
		/*
		 * while converting from decimal to Binary divide by 2 
		 * 
		 * we can use n!=0 in the while condition
		 */
		while (n != 0) {
			
			int lastDigit = n%2;
			ans = ans+lastDigit *placeValue;
			n = n/2;
			placeValue = placeValue * 10;
			
	
			

		}
		System.out.println(ans);
		
		
	}
}
