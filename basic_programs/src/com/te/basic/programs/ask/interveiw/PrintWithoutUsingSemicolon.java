package com.te.basic.programs.ask.interveiw;

public class PrintWithoutUsingSemicolon {

	/*
	 * we can print the statement in 3 ways 1] using if() statement (printf()) 2]
	 * Using append() in String BuilderClass 3] Using equals method in string class
	 * 
	 */

	public static void main(String[] args) {

		//using the if statements   (using printf() method)
		/*
		 * System.out.printf() and System.out.println() return void, 
		 * which means they don't return a value, and you cannot compare their return values with null.
		 */
		if (System.out.printf("Hello World1...") == null) {

		}
		
		//using for loop statements (using println() method)
		for(int i = 0;i<1;System.out.println("hello World!2...")) {
			i++;
		}

		// using the append() in stringBuilder Class
		if (System.out.append("Hello world!3.......") == null) {

		}
		
		//using equals() in String class
		if(System.out.equals("Hello World 4.....")) {
			
		}
	}
}
