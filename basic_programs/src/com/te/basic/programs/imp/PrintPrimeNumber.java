package com.te.basic.programs.imp;

import java.util.Scanner;

public class PrintPrimeNumber {

	static boolean prime(int n ) {
		if(n==0||n==1) return false;
		for(int i =2;i<n;i++) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner dc = new Scanner(System.in);
		System.out.println("Hi.. dear input please...");
		int n = dc.nextInt();

		for(int i =1;i<n;i++) {
			if(prime(i)) {
				System.out.println(i);
			}
		}


	}

}
