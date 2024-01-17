package com.te.basic.programs.imp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PallindromeList {
	static List<String> check(List<String> list){
		
	return	list.stream().map( value->{
		String l = value.toLowerCase();
		boolean match = IntStream.rangeClosed(0, l.length()-1)
			.allMatch(i-> l.charAt(i) == l.charAt(l.length()-1-i));
			
			return (match)?"Pallindrome":"Not Pallindrome";
		}).collect(Collectors.toList());
		
		
	}

	public static void main(String[] args) {
	List<String> a = Arrays.asList("Brunda Sahukar","Sa r as","SarAs","SaRaS");
	System.out.println(check(a));
	}
}
