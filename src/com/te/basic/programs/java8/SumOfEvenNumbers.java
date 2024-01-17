package com.te.basic.programs.java8;

import java.util.stream.IntStream;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		
		int sum = IntStream.rangeClosed(1, 10).filter(i->i%2 == 0).sum();
		System.out.println(sum);
	}
}
