package com.te.basic.programs.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallestIntegerFinder {
	
	
	public static int findSmallestInt(int[] args) {

		return Arrays.stream(args).min().orElseGet(null);

	}
	public static int small(int[] args) {
		 /*
		  *  of(int n) return intStream
		  *  min() return optiionalInt
		  *  getAsInt return int
		  */
		
		return IntStream.of(args).min().getAsInt();
	}

	public static int smallFind(int[] args) {
		int min = args[0];
		for(int i = 0;i< args.length;i++) {
			if(min>args[i]) {
				min = args[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] a = { 11, 4, 5, 67, 8, 9 };
		System.out.println(SmallestIntegerFinder.findSmallestInt(a));
		System.err.println(SmallestIntegerFinder.small(a));
		System.out.println(SmallestIntegerFinder.smallFind(a));
	}
}