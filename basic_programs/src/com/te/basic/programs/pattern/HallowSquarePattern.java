package com.te.basic.programs.pattern;

import java.util.Scanner;

public class HallowSquarePattern {
	public static void main(String[] args) {
		System.out.println("Enter the Number:  ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;
		for (i = 1; i <= n; i++) {
			
			for (j = 1; j <= n; j++) {
				
				if(i==1||j==1||i==n||j==n) {
					
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
				
			}
			System.out.println();

		}
	}

}

