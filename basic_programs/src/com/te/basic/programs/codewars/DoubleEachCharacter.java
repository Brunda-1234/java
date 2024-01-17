package com.te.basic.programs.codewars;

import java.util.stream.Collectors;

public class DoubleEachCharacter {
	/*
	 * Repeat() which is present string class
	 * we can use with strings
	 */
	
	//using character aRRAY
	public static String doubleChar(String s) {
		String ans = "";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {

			ans += c[i] + "" + c[i];

		}
		return ans;
	}
	
	
	//USING split[] 
	public static String doubleChars(String s) {
		String web ="";
		String [] s1 = s.split("");
		for(String i :s1) {
			web += i.repeat(2);
		}
		return web;
	}

	//using replaceAll() in String class
	public static String doubleChara(String s) {
		/*
		 * the . in the regular expression matches any character (not just a literal
		 * period). . matches any single character:
		 * 
		 * For example, the pattern c.t would match strings like "cat," "cut," "cot,"
		 * etc., where the . matches any character in the middle.
		 * 
		 * "$0$0" is the replacement string, where $0 represents the matched character,
		 * so it doubles each character in the input string s.
		 */
		return s.replaceAll(".", "$0$0");
	}

	
	//Using Character class
	public static String doublechar(String s) {

		String result = "";
		for (int i = 0; i < s.length(); i++)
			result += Character.toString(s.charAt(i)) + Character.toString(s.charAt(i));

		return result;
	}

	
	//using java 8
	public static String doublec(String s) {
		return s.chars() //intstream
//				.mapToObj(c ->(char)c + ""+(char)c)  //stream
				.mapToObj(c->String.valueOf((char)c).repeat(2)) //Stream<String>
				.collect(Collectors.joining()); //string
	}

	public static void main(String[] args) {

		System.out.println(doubleChar("String"));
		System.out.println(doubleChara("12456"));
		System.out.println(doublechar("BrundaS ahukar"));
		System.out.println(doublec("BrundaSahukar"));
		System.out.println(doubleChars("BrundaSahukar"));
	}

}
