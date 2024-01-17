package com.te.basic.programs.codewars;


import java.util.Arrays;

public class CheckArray {

	public static boolean checkArray(Object[] a, Object x) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return true;
			}
		}
		return false;

	}

	public static boolean checkArray1(Object[] a, Object x) {

		return Arrays.asList(a).contains(x);

	}
	public static boolean checkArray2(Object[] a, Object x) {

		return Arrays.stream(a).filter(i-> x.equals(i)).findFirst().isPresent();

	}
	public static boolean checkArray3(Object[] a, Object x) {

		return Arrays.stream(a).anyMatch(i-> x.equals(i));

	}

	public static void main(String[] args) {

		Object[] a = { 1, 3, 5, 6, "go", 'c' };
		Object x = 6;
		System.out.println(checkArray(a, x));
		System.err.println(checkArray1(a, x));
		System.out.println(checkArray2(a, x));
		System.err.println(checkArray3(a, x));
		
	
	}

}
