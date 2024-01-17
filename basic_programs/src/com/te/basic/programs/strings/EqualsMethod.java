package com.te.basic.programs.strings;

public class EqualsMethod {

	public static void main(String[] args) {
		
		String s = "Brunda";
		String b= new String("Brunda");
		String c = "Cristano Ronaldo";
		
		if(s == b) {
			System.out.println("Compares the Addresses of two string");
		}
		else if (s.equals(b)) {
			System.out.println("Compares the Content in the string");
		}else{
			System.out.println("No Comparison");
		}
		
	}
}
