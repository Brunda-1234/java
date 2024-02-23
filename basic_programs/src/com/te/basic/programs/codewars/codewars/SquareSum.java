package com.te.basic.programs.codewars;

import java.util.Arrays;

public class SquareSum {
	
	public static int square(int[] n) {
		return Arrays.stream(n).map(i->i*i).sum();
	}

	public static int sum(int[] n) {
		int sum=0;
		int num = 0;
		for(int i = 0;i<n.length;i++) {
			num = n[i]*n[i];
			sum =sum+num;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3};
		System.err.println(SquareSum.square(a));
		
		System.out.println(SquareSum.sum(a));
	}
}
