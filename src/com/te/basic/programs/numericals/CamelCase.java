package com.te.basic.programs.numericals;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {

	public static void main(String[] args) {
		
		String name = "camelCasingTest";
		String result ="";
		char[] ch = name.toCharArray();
		for(int i = 0;i<ch.length;i++)
		{
			char c = name.charAt(i);
			
			if(i>0 && Character.isUpperCase(c)) {
				result += " " +c;
			}else {
				result += c;
			}
		}
		System.out.println(result);
		
		String[] split = name.split("(?=[A-Z])");
		/*
		 * (?=[A-Z])
		 * Here's what it does:

           ?= is the syntax for a positive lookahead assertion,
            which asserts that what follows matches the enclosed pattern without including it in the match itself.
           [A-Z] is a character class that matches any uppercase letter from 'A' to 'Z'.
           So, (?=[A-Z]) means "split the string at a position where an uppercase letter (A-Z) is about to occur, 
           but don't include the uppercase letter in the split parts." This is used to split a camelCase 
           string into words based on the uppercase letters, effectively converting it to a more readable format 
           with spaces between the words.
		 */
		String collect = Arrays.stream(split).collect(Collectors.joining(" "));
		System.out.println(collect);
	}
}
