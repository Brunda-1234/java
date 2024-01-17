package com.te.basic.programs.pattern;

import java.util.Scanner;

public class NumberIncreasingPyramid {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the input");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

/*
 * ouput
 * 1 
   1 2 
   1 2 3 
   1 2 3 4 
 */