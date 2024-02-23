package com.te.basic.programs.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceAnArray {
	
	public static int reduce(int[] x) {
		int n = 1;
		for(int i = 0;i< x.length;i++) {
			n *= x[i];
		}
		return n;
	}
	public static int reducearray(int[] x) {
		/*
		 * reduce() :- performs the reduction of stream
		 * return int
		 * take input == identity =1
		 *               BinaryOperation to reduce = a*b
		 */
//		return IntStream.of(x).reduce(1, (a,b)->a*b);
		return Arrays.stream(x).reduce(1, (a,b)->a*b);
	}
	

	public static void main(String[] args) {
		int[]  a = {1,2,3,4,5};
		System.out.println(ReduceAnArray.reduce(a));
		System.err.println(ReduceAnArray.reducearray(a));
	}
}
