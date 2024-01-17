package com.te.basic.programs.numberclass;

public class IntegerClass {
	
	static Number n = 1000 ;
	public static void main(String[] args) {
		
		Integer a = 102;
		int bytes = Integer.BYTES; //number of bytes used to represent the int value
		System.out.println(bytes); //4
		
		int maxValue = Integer.MAX_VALUE; //constant holding the maximum value of an int 
		System.out.println(maxValue); //2147483647
		
		int minValue = Integer.MIN_VALUE; //constant holding the minimum value of an int 
		System.out.println(minValue); //-2147483648 
		
		int size = Integer.SIZE;
		/*
		 *Number of bits size represent the bits 
		 *Integer.SIZE is a final static integer value = 32 bits (4 byte)
		 */
		System.out.println(size);
		
		
		System.out.println(n);
		
		int bitCount = Integer.bitCount(a);
		/*
		 * Returns the number of one-bits in the two's complement binary representation of the specified int value.
		 *  This function is sometimes referred to as the population count.
		 */
		System.out.println(a); //102
		
		
		int b = 30;
		int d = 50;
		
		int compare = Integer.compare(d, d);
		/*
		 * Compares two int values numerically
		 * 
		 * if both are equal return 0
		 * if a >b return 1
		 * if a<b return -1
		 */
		System.out.println(compare);
		
		int compareUnsigned = Integer.compareUnsigned(b, d);
		System.out.println(compareUnsigned);
		System.out.println(10>>>3);
		
		
		
	}
}
