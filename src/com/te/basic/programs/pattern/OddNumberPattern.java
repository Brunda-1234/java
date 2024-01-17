package com.te.basic.programs.pattern;

import java.util.Scanner;

public class OddNumberPattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the number: --");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	    int i,j;
	    int k=1;
	    int space = n-1;
	    for(i=1;i<=n;i++) {
	    	for(j=1;j<=space;j++) {
	    		System.out.print(" ");
	    	}
	    	for(j=1;j<=i;j++) {
	    		System.out.print(k+" ");
	    		k+=2;
	    		if(k > 9) {
	    			k =1;
	    		}
	    	}
	    	System.out.println();
	    	space--;
	    }
	}
}
