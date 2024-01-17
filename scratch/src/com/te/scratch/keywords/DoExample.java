package com.te.scratch.keywords;

public class DoExample {
	
	public static void main(String[] args) {
		
		int a =10;
		int b = 12;
	
		do
        {
            a = a + b;
             
            b = b + 10;
             
            System.out.println("a = "+a);
             
            System.out.println("b = "+b);
             
        } while (a <= 100);
	}

}
