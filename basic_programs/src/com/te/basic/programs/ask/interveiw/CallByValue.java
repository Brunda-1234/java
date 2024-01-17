package com.te.basic.programs.ask.interveiw;

public class CallByValue {

	public static void main(String[] args) {

		int a=1000;
		System.out.println(a);
		int b =a;//here im assigning the value of a to the b
		b =2000;
		System.out.println(b);
		System.out.println(a);
		
		a =300;
		System.out.println(a);
		/*
		 * call by value
		 * 
		 * 1000 value is assigned to the variable a
		 * 
		 *  b=a;
		 *  
		 *  the copy of the 1000 value is stored in the variable b
		 *  b=2000;
		 *  if we change the value of the b it won't affect the value in the a it should be 1000 itself
		 *  
		 *  
		 *  
		 *  Note ****
		 *   
		 *      Java is Call By Value 
		 *         
		 */
	}

}
