package com.te.basic.programs.ask.interveiw;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckPallindromeInList {
	
	public static List<String> check(List<String> list) {
		
		return list.stream().map(value -> {

			boolean allMatch = IntStream.rangeClosed(0, value.length())
					.allMatch(i -> value.toLowerCase().charAt(i) == value.toLowerCase().charAt(value.length() - 1));
			
			System.out.println(allMatch);
//			System.out.println(value.toLowerCase().charAt(0) == value.toLowerCase().charAt(value.length() - 1-0));
//			System.out.println(value.toLowerCase().charAt(0));
//			System.err.println(value.toLowerCase().charAt(value.length()-1-0));
		return	(allMatch)?"Pallindrome":"Not Pallindrome";
		}).collect(Collectors.toList());
	
	
	}
	
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Brunda" ,"Saars","saars","Saars");
		System.out.println(check(list));
	}

}
