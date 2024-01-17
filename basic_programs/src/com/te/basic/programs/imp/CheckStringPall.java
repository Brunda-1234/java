package com.te.basic.programs.imp;

import java.util.stream.IntStream;

public class CheckStringPall {

	static String check(String n) {
		String s = n.toLowerCase();
		System.out.println(s);
		boolean allMatch = IntStream.rangeClosed(0,s.length()-1).allMatch(i-> s.charAt(i) == s.charAt(s.length()-1-i));
		
		return (allMatch)?"Pallindrome":"NotPallindrome";
	}
	
	public static void main(String[] args) {
		
		System.out.println(check("Madam"));
	}
}
