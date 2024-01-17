package com.te.basic.programs.imp;

import java.util.stream.IntStream;

public class Pallindrome {
	static String reverse(int n) {

		String s = String.valueOf(n);
		char[] c = s.toCharArray();
		boolean allMatch = IntStream.rangeClosed(0,s.toCharArray().length-1).allMatch(i -> s.charAt(i) == s.charAt(c.length - 1 - i));
		return (allMatch) ? "Pallindrome" : "Not Pallindrome";
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverse(95652859));
	}
}
