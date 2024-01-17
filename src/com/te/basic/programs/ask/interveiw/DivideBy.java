package com.te.basic.programs.ask.interveiw;

import java.util.Scanner;

public class DivideBy {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Numerator: ");
		int numerator = sc.nextInt();
		System.out.println("Enter the Denominator: " );
		
		int denominator  =  sc.nextInt();
		
		sc.close();
		
		int count = 0;
		int countd = 0;
		while(numerator >denominator) {
			numerator -= denominator;
			count++;
		}
		
		if(numerator < denominator) {
			numerator *= 10;
			
			
		}
		while(numerator> denominator) {
			numerator -=denominator;
			countd++;
			
		}
		System.out.println(count +"."+countd);
		
		
	}

}
