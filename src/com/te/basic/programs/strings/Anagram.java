package com.te.basic.programs.strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
/*
 * The both String having the
 */
	public static void main(String[] args) {

		String s1 = "Brunda";
		String s2 = "unbradfgd";

		String string = s1.toLowerCase().chars() // chars() return IntStream
				.mapToObj(c -> String.valueOf((char) c)) // return Stream(String)
				.sorted() // return Stream(String)
				.collect(Collectors.joining());// String

		System.out.println(string);

		String string2 = s2.toLowerCase().chars().mapToObj(a -> String.valueOf((char) a)).sorted()
				.collect(Collectors.joining());

		System.out.println(string2);

		if (string.equalsIgnoreCase(string2)) {
			System.err.println("The Given " + string + " & " + string2 + " are Anagram ");
		}else {
			System.out.println("The Given Strings are Not Anagram");
		}
	}

}
