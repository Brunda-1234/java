package com.te.basic.programs.codewars;

public class EndStrings {
	
	public static boolean solution(String str, String ending) {

		String a = str.substring(str.length()/2);
		
	     System.err.println(a);
	     
	    return a.equalsIgnoreCase(ending) ? true : false;
	  }

	public static void main(String[] args) {
		
		System.out.println(EndStrings.solution("Brunda Sahukar", "nda"));
	}
}
