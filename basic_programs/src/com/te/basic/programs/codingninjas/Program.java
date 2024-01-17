package com.te.basic.programs.codingninjas;

public class Program {
	
	private int i=1;
	
	public static void main(String[] args) {
		
		int i=2;
		Program s = new Program();
		s.someMethod();
	}

	private void someMethod() {
	
		System.out.println(i);
	}

}
