package com.te.basic.programs.ask.interveiw;

public class DivisonwithoutUsingOperators {
	
	public static void main(String[] args) {
		
		int a = 33;
		int b = 5;
		int count =0;
	
		while(a>=5) {
			a =a-b;
//			System.out.println(a);
			count++;
			
			
		}
		
	
		System.out.println(count +" Quotient");
		System.out.println(a + " remainder");


}
}