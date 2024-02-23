package com.te.basic.programs.codewars;

public class ConvertTheStringtoNumber {

	public static int stringToNumber(String str) {
		
		
		return Integer.parseInt(str);
	    
	  }
	//using valueOf from integer class
	public static int convert(String str) {
		return Integer.valueOf(str);
	}
	public static void main(String[] args) {
		System.out.println(ConvertTheStringtoNumber.stringToNumber("1235747"));
		System.err.println(ConvertTheStringtoNumber.convert("145678"));
	}
}
