package com.te.basic.programs.strings;

import java.util.Scanner;

public class ReverseString {

	
	public static String comr(String s) {
		return new StringBuilder().append(s).reverse().toString();
	}
	public static void main(String[] args) {
		
		System.out.println("Hi..dr...i'm here:--");
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		String rev = "";
		for(int i=s.length()-1 ;i>=0;i--) {
			rev += s.charAt(i);
            

		}
		
	   System.out.println(ReverseString.comr("bryunda Sahukar %^"));
	
        System.out.println("Reverse Of the Given String   :  "+ rev);

        
	}
}
