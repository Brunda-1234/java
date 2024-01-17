package com.te.basic.programs.pattern;

import java.util.Scanner;

public class NumberIncreasinginReversePyramid {
	
	public static void main(String[] args) {
		System.out.println("enter the number: ");
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
	}

}
/*
 * 1 2 3 4 
   1 2 3 
   1 2 
   1 
 */