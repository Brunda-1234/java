package com.te.my.programs;

import java.util.Scanner;

public class IdealWeight {
	
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
	
			// Input: Ideal weight and current weight of Ram
			int idealWeight = scanner.nextInt();
			int currentWeight = scanner.nextInt();
	
			// Calculate the minimum time in months
			int months = calculateMonths(idealWeight, currentWeight);
	
			// Output: Minimum time in months
			System.out.println(months);
	
			// Close the scanner
			scanner.close();
			/*
			 * Attempting to perform search operations after a scanner has been
			 *  closed will result in an IllegalStateException.
			 *  scanner.nextInt() runtime error
			 */
		}
	
		// Function to calculate the minimum time in months
		private static int calculateMonths(int idealWeight, int currentWeight) {
			
			int months = 0;
	
			// Continue until the current weight is greater than or equal to the ideal
			// weight
			while(currentWeight < idealWeight) {
				months++;
				currentWeight += months;
			}
	
			return months;
		}
}
//input :== 
/*
 * 11 
 * 5
 * 
 * 
 * ouput :==
 * 3
 */



