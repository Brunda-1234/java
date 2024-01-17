package com.te.basic.programs.codewars;

public class FindThePerfectNumber {
	public static long findNextSquare(long sq) {
//	    // Calculate the square root of the input number.
//	    double sqrt = Math.sqrt(sq);
//
//	    // Check if the square root is an integer.
//	    if (sqrt % 1 == 0) {
//	        // If it is, add 1 to it, square the result, and return it.
//	        long nextPerfectSquare = (long) Math.pow(sqrt + 1, 2);
//	        return nextPerfectSquare;
//	    } else {
//	        // If not, return -1.
//	        return -1;
		
//		  return Math.sqrt(sq) % 1 != 0 ? -1 : (long)Math.pow(Math.sqrt(sq)+1,2);
		
		  long root = (long) Math.sqrt(sq);
	      return root * root == sq ? (root + 1) * (root + 1) : -1;
	}

	
	public static void main(String[] args) {
		
		long input1 = 121;
		long input2 = 625;
		long input3 = 114;

		long result1 = findNextSquare(input1);
		long result2 = findNextSquare(input2);
		long result3 = findNextSquare(input3);

		System.out.println("Result 1: " + result1); // Output: 144
		System.out.println("Result 2: " + result2); // Output: 676
		System.out.println("Result 3: " + result3); // Output: -1

	}
}
