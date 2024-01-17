package com.te.basic.programs.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAString {
	
	public static String solution(String str) {


		StringBuffer buffer = new StringBuffer(str);
		buffer.reverse();
	    
	    return buffer.toString();
	  }
	
	
	public static String solutionA(String str) {
		char[] a = str.toCharArray();
		int start = 0;
		int end = str.length()-1;
		
		while(start<end) {
			char temp = a[end];
			a[end] = a[start];
			a[start] = temp;
			start ++;
			end--;
		}
		System.err.println(Arrays.toString(a));
	return new String(a);

		
	}
	
	public static String solu(String str) {
		
		return new StringBuilder(str).reverse().toString();
		
	}
	
	public static String solun(String str) {
		String n = "";
		for(int i = str.length()-1;i>=0;i--) {
			char c = str.charAt(i);
			n += c;
		}
		return n;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(ReverseAString.solution("Brunda  dgf"));
		System.out.println(ReverseAString.solutionA("Shyam  $%^"));
		System.out.println(ReverseAString.solu("Cristiano Ronaldo"));
		System.out.println(ReverseAString.solun("Bottle 23424 $%^"));
	}

}
