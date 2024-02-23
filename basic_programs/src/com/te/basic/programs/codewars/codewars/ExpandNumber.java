package com.te.basic.programs.codewars;

public class ExpandNumber {

	public static String expandedForm(int num) {

		String temp = "";
		String finalout = "";
		String s = String.valueOf(num);
		int len = String.valueOf(num).length();
		for (int i = 0; i < len; i++) {

			char charAt = s.charAt(i);

			if (charAt != '0') {

				temp = charAt + "";
				for (int k = 0; k < len - i - 1; k++) {
					temp = temp + "0";
				}
				System.out.println(temp);
				if (i == len - 1 || temp.equals(s)) {
					finalout += temp;
				} else{
					
					finalout += temp + " + ";
				}
			}
		}
	   
		
		return finalout;
	}
	


	public static void main(String[] args) {
		System.out.println(expandedForm(20));
	}
}
