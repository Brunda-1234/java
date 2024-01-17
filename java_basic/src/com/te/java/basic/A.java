package com.te.java.basic;

import com.te.java.basic.problem.B;

public class A extends B {
/*
 * 
 * protected --- access outside the package by using subclass only
 */
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.i);
	
		
		
	}

}
