package com.te.basic.programs.strings;

import java.util.Arrays;
import java.util.List;

public class VowelsCount {

	public static void main(String[] args) {

		String a = "Brunda sahukar  fhtyjszcdee";
		int count = 0;
		char[] ch = a.toLowerCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char charAt = a.charAt(i);
			if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
				count++;
			}
		}

		System.out.println(count);

		// Another way

		List<Character> asList = Arrays.asList('a', 'e', 'i', 'o', 'u');
		int vCount = 0;
		for (int i = 0; i < a.length(); i++) {
			if (asList.contains(a.charAt(i))) {
				vCount++;
			}
		}
		System.err.println(vCount);

		// Using Java8
		long count2 = a.toLowerCase().chars().mapToObj(am -> (char) am).filter(b -> "AEIOUaeiou".indexOf(b) != -1)
				.count();
		System.out.println(count2);
	}

}
