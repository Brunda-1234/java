package com.te.basic.programs.codewars;

import java.util.Arrays;

public class SumOfArrays {
	
	public static double sum(double[] numbers) {
		
		if(numbers.length == 0) {
			return 0;
		}
		double n = 0;
		for(int i = 0;i<numbers.length;i++) {
			n += numbers[i];
		}
		
		return n;
	}
	
	public static double sums(double[] numbers) {
		
		return Arrays.stream(numbers).sum();
	}
	public static void main(String[] args) {
		double[] n = {1,-1,2.3,6.8,9.0};
		System.out.println(SumOfArrays.sum(n));
		System.err.println(SumOfArrays.sums(n));
	}

}
