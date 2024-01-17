package com.te.scratch.keywords;

import java.util.Scanner;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		String f = sc.next();
		int a = 10;
		
		try {
//			int a = Integer.parseInt(f);
			int b = a/0;
		}catch(ArithmeticException e) {
			System.out.println("Exception" + e.getStackTrace() + e.getLocalizedMessage());
			e.getMessage();
		}finally {
			System.out.println("This will printed Always");
		}
	}
}
