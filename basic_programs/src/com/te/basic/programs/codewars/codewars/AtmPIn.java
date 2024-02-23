package com.te.basic.programs.codewars;

public class AtmPIn {

	private static boolean check(String s) {

		if (s.length() == 4 || s.length() == 6) {

			if (s.matches("[0-9]+")) {
				/*
				 *  regex exprtession
				 * 
				 * [0-9] matches a single digit (0, 1, 2, ..., 9).
                   + means "one or more," so [0-9]+ matches one or more consecutive digits.
				 */

				return true;

			}
		}
		return false;
		
	}

	public static boolean checks(String s) {
		return s.matches("\\d{4}|\\d{6}");
	}
	
	public static boolean checksOne(String s) {
		return s.matches("[0-9]{4}|[0-9]{6}");
	}

	public static void main(String[] args) {
		String demo = "-123";
		System.err.println(check(demo));
		System.out.println(checks(".a12"));
		System.err.println(checksOne("123a"));
	}
}
