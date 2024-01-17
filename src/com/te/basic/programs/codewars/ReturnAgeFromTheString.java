package com.te.basic.programs.codewars;

public class ReturnAgeFromTheString {

	public static int returnAge(final String x) {

		return Character.getNumericValue(x.charAt(0));
	}

	public static int returnA(final String x) {

		String[] split = x.split(" ");
		return Integer.parseInt(split[0]);

	}

	public static int returnAg(final String x) {

		
		return x.charAt(0)-'0';

	}

	public static void main(String[] args) {

		System.out.println(returnAge("8 years old"));
		System.err.println(returnA("5 Years ago"));
		System.out.println(returnAg("6 Years old"));

	}
}
