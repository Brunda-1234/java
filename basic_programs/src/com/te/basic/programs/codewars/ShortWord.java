package com.te.basic.programs.codewars;

import java.util.Arrays;

public class ShortWord {
	
	public static int worlsLength(String s) {
	int shortestLength = Integer.MAX_VALUE;
	System.err.println(shortestLength);
		String[] split = s.split(" ");
		
		for(String st : split) {
			int large = st.length();
		
		if(large< shortestLength) {
			shortestLength = large;


		}
		}
		return shortestLength;
	}
	
	public static int shortLength(String s) {
		return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
	}
	public static int shorts(String s){
		 return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
		}

	public static void main(String[] args) {
		
		System.err.println(ShortWord.worlsLength("Brunda Sahukar is a very good girl "));
		System.out.println(ShortWord.shortLength("Brunda Sahukar is a very good girl "));
		
	}
}
