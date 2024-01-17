package com.te.basic.programs.codewars;

import java.util.stream.IntStream;

public class CheckFactorofNumber {

	/*
	 * Factors are numbers you can multiply together to get another number.
     2 and 3 are factors of 6 because: 2 * 3 = 6

	 */
	
	public static boolean check(int base ,int factor) {
		return base%factor == 0;
	}
	
	public static boolean checkN(int base ,int factor) {
		return (base%factor == 0)?true:false;
	}
	
	public static boolean checkNum(int base ,int factor) {
		return IntStream.of(base,factor).anyMatch(value->base% factor == 0);
	}
	
	public static void main(String[] args) {
		
		System.out.println(check(10, 2));
		System.err.println(checkN(11, 3));
		System.err.println(checkNum(50, 2));
	}
}
