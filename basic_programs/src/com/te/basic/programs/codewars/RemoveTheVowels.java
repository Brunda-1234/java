package com.te.basic.programs.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveTheVowels {

	public static String remove(String s) {

		String d = "";
		String h = "";

		char[] c = s.toCharArray();

		for (int j = 0; j < c.length; j++) {

			if (c[j] == 'A' || c[j] == 'E' || c[j] == 'I' || c[j] == 'O' || c[j] == 'U' 
			|| c[j] == 'a' || c[j] == 'e'|| c[j] == 'i' || c[j] == 'o' || c[j] == 'u') {

				d = d + c[j];

			} else {
				h = h + c[j];
			}

		}
		return h;
	}

	public static String vowelsRemove(String s) {

		StringBuilder builder = new StringBuilder();
		for (char j : s.toCharArray()) {
			
			/*
			 * the indexOf(c) function is used to check if the character c is
			 *  present in the string "AEIOUaeiou".
			 *  
			 *  indexOf(c) returns the index of the first occurrence of the 
			 *  character c within the string "AEIOUaeiou". If c is not found in the string, indexOf(c) returns -1.
                So, when indexOf(c) returns -1, it means that the character c is not found in the string 
                "AEIOUaeiou", which implies that c is not a vowel.
			 */
			if ("AEIOUaeiou".indexOf(j) == -1) {
				builder.append(j);
			}

		}

		return builder.toString();
	}

	//using string method replaceAll(regex,new String)
	public static String vRemove(String s) {
		return s.replaceAll("[AEIOUaeiou]", "");
	}

	//using java 8
	public static String removeVowels(String s) {
		return Arrays.stream(s.split(" ")).map(i -> i.replaceAll("[AEIOUaeiou]", "")).collect(Collectors.joining(" "));
	}

	public static void main(String[] args) {

		String h = "Hii Hello MOm Im Back";
		System.out.println(RemoveTheVowels.remove(h));
		System.err.println(vowelsRemove(h));
		System.out.println(vRemove(h));
		System.err.println(removeVowels(h));
	}

}
