package com.te.basic.programs.numericals;

public class Test {

	public static void main(String[] args) {
		
		double n = 2.2_67_76;
		System.out.println(n);
		for(int i = 0;i<5;i++) {
			if(i==2) {
				continue;
			}
			System.out.println(i);
		}
//		System.out.println(null);
		/*
		 * The method println(char[]) is ambiguous for the type PrintStream
		 * "The method println(char[]) is ambiguous for the type PrintStream,"
		 *  occurs because there is an ambiguity in the method overloading for System.out.println 
		 *  when you pass null as the argument. In Java, there are multiple println methods
		 *   that can accept different types of arguments, and the compiler can't determine 
		 *   which one to use when you pass null.
		 *   
		 *   
		 *   to resolve this we can cast the String
		 */
		
		System.out.println((String) null); //this will print the null value
	}
}
