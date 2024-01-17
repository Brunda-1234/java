package com.te.java.basic.problem;

public interface A {

	static String go() {
		return "Hello Static";
	}
	
	default String come() {
		return "hello Default";
	}
	
	String stand();

}
