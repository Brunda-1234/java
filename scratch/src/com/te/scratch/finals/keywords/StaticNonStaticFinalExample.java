package com.te.scratch.finals.keywords;

public class StaticNonStaticFinalExample {

	static final int i= 10;
	final int j = 20;
	
	void method(int k) {
		
		k=20;
		System.err.println("Method Final Executed " +k);
		
	}
	
	public static void main(String[] args) {
		
		StaticNonStaticFinalExample example = new StaticNonStaticFinalExample();
//		example.j =20; //compile tiem error
		
		example.method(example.j);
		
	    System.out.println(" Static Final Variables " +i);
	    System.out.println("Non Static Final variable " + example.j);
	 
	}
}
