package com.te.basic.programs.codewars;

public class OppositeOfNumber {
	
	
	public static int opposite(int number) {
		return -number;
	}

	 public static int oppositew(int number)
     {
         return (number>0)?-number:-number;
     }
	
	public static void main(String[] args) {

		System.out.println(opposite(-2));
		System.err.println(oppositew(-2));
	}
}
