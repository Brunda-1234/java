package com.te.basic.programs.strings;

import java.util.Arrays;

public class IsoGram {

	public static void main(String[] args) {

		String s = "Machine dee";
		if (isIsogram(s)) {
			System.out.println("Isogram");
		} else {
			System.out.println("Not Isogram");
		}

		//Using Java 8
		/*
		 * Character - isAlphabetic(int codePoint) return boolean
		 * 
		 * Determines if the specified character (Unicode code point) is alphabetic. 
		 * Parameters:codePoint the character (Unicode code point) to be tested
		 * Returns:true if the character is a Unicode alphabet character, false otherwise.
		 */
		boolean res = s.toLowerCase().chars().filter(Character::isAlphabetic).distinct()
				.count() == s.length();
		System.out.println(res);
		
		System.err.println(isogram("Machine"));
		
	}

	private static boolean isIsogram(String s) {

		char[] ch = s.toLowerCase().toCharArray();
		Arrays.sort(ch);
		for (int i = 0; i < ch.length - 1; i++) {
			System.out.println(ch[i]);
			if (ch[i] == ch[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	static boolean isogram(String str) {
		
		return str.length() == str.toLowerCase().chars().distinct().count();
	}
}
