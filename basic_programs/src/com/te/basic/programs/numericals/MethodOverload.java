package com.te.basic.programs.numericals;

public class MethodOverload {
	
	
	public static void main(String[] args) {
	test('c');
	}
	private static void test(double d) {
		System.out.println(d +" double method"); 
	}
	private static void test(long b) {
		System.out.println(b +" long method"); 
	}
//	private static void test(int i) {
//		System.out.println(i +" int method"); 
//	}
	private static void test() {
		// TODO Auto-generated method stub
		System.out.println (" method"); 
		
	}

}
