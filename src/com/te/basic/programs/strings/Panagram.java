package com.te.basic.programs.strings;

import java.util.stream.Collectors;

public class Panagram {

	public static void main(String[] args) {

		String s = "The quick brown fox jumps over the lazy dog dhfrdty sdfisdyfu szdfguegt";
		String s1 = "Hello World";
		System.err.println(isPanagram(s1));

		//using Stream
		Boolean a = s.toLowerCase().chars().filter(Character::isAlphabetic).distinct().count() == 26;
		if (a) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

	//using for loop
	private static String isPanagram(String s) {

		if (s.length() < 26) {
			return "String is Not panagram";
		}

		for (char i = 'a'; i <= 'z'; i++) {
			int indexOf = s.indexOf(i);
			if (indexOf < 0) {
				return "The String is not panagram";
			}

		}
		return "The String is Panagram";
	}

}
