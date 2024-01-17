package com.te.basic.programs.codewars;

import java.util.Arrays;
import java.util.stream.Stream;

public class AverageOfAnArray {

	public static double avg(int[] array) {
		double len = array.length;
		double sum = 0.0;
		for(int i :array) {
			sum = sum+i;
		}
		
		return sum/len;
	}
	
	public static double average(int[] array) {
	
		return Arrays.stream(array).average().orElse(0);
	}
	public static void main(String[] args) {
		
		int[] a = {2,3,4,5,7};
		
		System.out.println(AverageOfAnArray.avg(a));
		System.err.println(average(a));
	}
}
