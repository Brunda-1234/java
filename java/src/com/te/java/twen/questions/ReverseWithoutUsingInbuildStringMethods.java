package com.te.java.twen.questions;

import java.util.Scanner;

public class ReverseWithoutUsingInbuildStringMethods {
	public static String reverse(String s){

	       StringBuilder res= new StringBuilder(s);
	        return  res.reverse().toString();

	     }
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String nextLine = sc.nextLine();
		sc.close();
		System.out.println(reverse(nextLine));
	}
}
