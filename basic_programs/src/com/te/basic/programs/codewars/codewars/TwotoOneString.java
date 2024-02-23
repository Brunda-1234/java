package com.te.basic.programs.codewars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwotoOneString {

	public static String two(String s,String s2) {
		
		 return Stream.of(s.concat(s2).split("")).sorted().distinct().collect(Collectors.joining());
		
	}
	
	public static String twoToOne(String s1,String s2) {
		
		String s = s1+s2.toLowerCase();
		String out = null;
		for(char c ='a';c<='z';c++) {
			if(s.contains(c +"")) {
				out+=out;
			}
		}
		return out;
	}
	public static String longest (String s1, String s2) {
	     String ans =s1+s2;
	     return ans.toLowerCase().chars().sorted().distinct().mapToObj(ch->String.valueOf((char)ch)).collect(Collectors.joining());
	      
	       
	    }
	public static void main(String[] args) {
		System.out.println(two("sajdghsadfy", "addfdsadsa"));
		System.out.println(longest("sajdghsAKadfy", "addfHGFdsadsa"));
		System.err.println(longest("sajdgAhsadGGGfZZZy", "addfdsadsa"));
	}
}
