package com.te.basic.programs.ask.interveiw;

public class InfiniteLoop {

	public static void main(String[] args) {
		
		int n = 15;
		for(;;) {
			/*
			 * there is not condition in  the the loop 
			 * so it will loop continuously
			 */
			System.out.println(n);
		}
		
//		System.err.println("Hii..............."); // here im getting the compiler error
		 //bcz the loop will executes continuously (infinite times) 
	}
}
