package com.te.basic.programs.codewars;

import java.util.Arrays;

public class MexicanWave {

	public static String[] wave(String str) {
		String[] res = new String[str.length()];

		for (int i = 0; i < str.length(); i++) {
			char[] chars = str.toCharArray();

			if(Character.isWhitespace(chars[i])) {
				continue;
			}
				if (Character.isLetter(chars[i])) {

					chars[i] = Character.toUpperCase(chars[i]);
					res[i] = new String(chars);
				}
			

		}

		return Arrays.stream(res).filter(s->s != null).toArray(String[]::new);
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(wave("hell o")));
	}
}
