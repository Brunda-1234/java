package com.te.scratch.constructors;

import java.lang.reflect.Constructor;

public class PrivateConstructor {
	
	private PrivateConstructor() {
		super();
	}
	public static void main(String[] args) {
		
		PrivateConstructor constructor = new PrivateConstructor();
	
	}

}
class A{
	private A() {
		super();
	}
	/*
	 * we are not able to create a object for privaet constructor 
	 * bcz.,.. it only access within the class itself
	 */
}
