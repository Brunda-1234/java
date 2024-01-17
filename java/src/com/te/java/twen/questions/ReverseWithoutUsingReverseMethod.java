package com.te.java.twen.questions;

import java.util.Scanner;

public class ReverseWithoutUsingReverseMethod {
	public static String reverse(String s) {
		String res = "";

		for (int i = s.length()-1; i >= 0; i--) {

			res += s.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nextLine = sc.nextLine();
		sc.close();
   System.out.println(reverse(nextLine));
	}
}
