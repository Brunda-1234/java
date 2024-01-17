package com.te.basic.programs.numericals;

import java.util.Scanner;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		
		System.err.println("Enter the Number: ");
		
		Scanner scanner = new Scanner(System.in);
	      int n = scanner.nextInt();
	      int i;
	      if(n==1) {
	    	  System.out.println(" Prime nUmber starts From 2 ");
	      }
	      for(i=2;i<n;i++) { 
	    	  if(n%i == 0) {
	    		  System.out.println(n + " Not Prime");
	    		  break;
	    	  }
	      }
	      if(n==i) {
	    	  System.out.println(n + " Prime");
	      }
	}
}
