package com.te.basic.programs.numericals;

import java.util.Scanner;

public class SwapNumberWithoutUsingThirdVariable {

     public static void main(String[] args) {
		
    	 System.err.println("Enter the two number: ");
    	 Scanner sc = new Scanner(System.in);
    	 int a = sc.nextInt();
    	 int b = sc.nextInt();
    	 System.out.println(a);
    	 System.out.println(b);
    	 
    	 a = a*b;
    	 b = a/b;
    	 a = a/b;
    	 System.out.println("Swap "+a);
    	 System.out.println("Swap " +b);
    	 
    	 
    	 
	}
}
