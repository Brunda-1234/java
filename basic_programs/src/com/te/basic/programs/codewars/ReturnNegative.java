package com.te.basic.programs.codewars;

public class ReturnNegative {
	/*
	 * Kata.makeNegative(1);  // return -1
       Kata.makeNegative(-5); // return -5
       Kata.makeNegative(0);  // return 0

	 */
	public static int negative(int  x) {
//		return (x<0)?x:(x>0)?-x:0;
		return (x<0)?x:-x;
	}
	
	public static int returnNegative(int x) {
		/*
		 * Returns the absolute value of an int value.If the argument is not negative,
		 *  the argument is returned.If the argument is negative, the negation of the argument is returned
		 */
		int abs = Math.abs(x);
		return -abs;
	}
	public static void main(String[] args) {
		System.out.println(ReturnNegative.negative(6));
		System.err.println(returnNegative(0));
	}

}
