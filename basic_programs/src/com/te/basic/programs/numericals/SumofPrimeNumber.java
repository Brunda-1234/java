package com.te.basic.programs.numericals;

import java.util.Scanner;

public class SumofPrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number:--");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int sum = 0;

		for(i =1;i<n;i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

	public static boolean isPrime(int n) {
		int i;
		if (n == 1) {
			System.out.println("The Prime Number Starts From 2");
		}
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
