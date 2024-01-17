package com.te.basic.programs.numericals;

public class Heloo {
 
	static void method(Integer i) {
		System.out.println(i + "INtger");
	}

//	static void method(var i) {   
//		System.out.println(i);
//	}

	static void method(Number i) {
		System.out.println(i + " Number");
	}

	static void method(Object i) {
		System.out.println(i + " object");
	}

	public static void main(String[] args) {

		var a = 12;
		method((short) a);
	}
}
