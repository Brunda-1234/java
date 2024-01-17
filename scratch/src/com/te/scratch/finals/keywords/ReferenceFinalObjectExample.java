package com.te.scratch.finals.keywords;

public class ReferenceFinalObjectExample {
	
	int i =10;
	public static void main(String[] args) {
		
	final ReferenceFinalObjectExample ex = new ReferenceFinalObjectExample();
	System.out.println("Before reinitializing.. "+ex.i);
	ex.i = 30;
	System.out.println("After Reinitializing.. "+ex.i);
	
//	ex = new ReferenceFinalObjectExample();  compile time error
	/*
	 * but we can't create an new object using reference which is final 
	 */
	
	}

}
