package com.te.basic.programs.conversion;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		System.out.println("Enter the Number:--");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
/*
 * while converting from Binary to decimal divide by 10 
 */
		int ans = 0;
		int placeValue = 1;
		while (n != 0) {

			int lastDigit = n % 10;
			ans = ans + lastDigit * placeValue;
			placeValue = placeValue * 2;   
			n = n / 10;
	
		}
		System.out.println(ans);
	}
}
