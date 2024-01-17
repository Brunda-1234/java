package com.te.java.twen.questions;

import java.util.Arrays;
import java.util.Scanner;

public class SwapusingThirdVariable {
	public static int[] swap(int a, int b) {

		int temp = a;
		a = b;
		b = temp;
		int[] res = { a, b };
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.err.println(Arrays.toString(swap(a, b)));
	}
}
