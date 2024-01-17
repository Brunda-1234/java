package com.te.basic.programs.imp;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Factorial {

	static int fact(int n) {
		int fact = 1;
		for(int i = 1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
		
	
		
	}
	static int fac(int n) {
		
		/*
		 * reduce   
		 * 
		 * Performs a reduction on the elements of this stream, using the provided identity value 
		 * and an associative accumulation function, and returns the reduced value
		 * 
		 *   int sum = integers.reduce(0, (a, b) -> a+b);
		 *   
		 *   return int value
		 *   
		 *   Parameters:identity the identity value for the accumulating function
		 *   op an associative, non-interfering, state less function for combining two values (BINARYOPERATOR)
		 *   
		 *   This is a terminal operation
		 */

     return IntStream.rangeClosed(1, n).reduce(1,(a,b)-> a*b);
		
	}
	public static void main(String[] args) {
		
		System.out.println(fact(4));
		
		System.out.println(fac(3));
	}
}
