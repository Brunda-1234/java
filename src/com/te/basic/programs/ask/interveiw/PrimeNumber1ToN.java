package com.te.basic.programs.ask.interveiw;

public class PrimeNumber1ToN {

	public static boolean prime(int n) {

		if (n == 0 || n == 1)
			return false;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

//		(args != null)?System.out.println("Hwllo World!"):null ;
		int n = 10;
   
		for (int i = 1; i <= n; i++) {
			if (prime(i)) {
				System.out.println(i + " ");
			}

		}

	}
}
