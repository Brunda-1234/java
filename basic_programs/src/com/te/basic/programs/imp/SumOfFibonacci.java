package com.te.basic.programs.imp;

import java.util.stream.Stream;

public class SumOfFibonacci {
	
	public static void main(String[] args) {
		
		int sum = Stream.iterate(new int[] {0,1},t-> new int[] {t[1],t[0]+t[1]})
		.limit(10)
		.map(t->t[0])
		.mapToInt(Integer::valueOf)
		.sum();
		
		System.out.println(sum);
		//output ==  88
	}

}
