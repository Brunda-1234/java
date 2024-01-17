package com.te.basic.programs.strings;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedString {

	public static void main(String[] args) {

//		String s = "Bruafnda Sahukar  &*&Hsfggggdfrwe56";
		String s = "aabbbccccddddd";
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		int count[] = new int[128];

		for (int i = 0; i <= s.length() - 1; i++) {
			char c = s.charAt(i);
			count[c]++;
			for (int j = 0; j <= count.length - 1; j++) {
//				System.err.println(count[1]);
				if (count[j] != 0) {
//					System.out.println((char)j +" " + count[j]);
					map.put((char) j, count[j]);
				}
			}

		}

		System.out.println(map);

	}

}
