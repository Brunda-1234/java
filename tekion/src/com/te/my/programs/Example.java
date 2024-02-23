package com.te.my.programs;

public class Example {

	public static void main(String[] args) {
		
		String s = "11010";
		int originalNumber = forOriginal(s);
		System.out.println(originalNumber);
	}

	private static int forOriginal(String s) {
		String res = "";
		
		for(char c:s.toCharArray()){
			
			char ch = (c =='0')?'1':'0';
			res+= ch;
		}
		return Integer.parseInt(res,2);
	}
}
