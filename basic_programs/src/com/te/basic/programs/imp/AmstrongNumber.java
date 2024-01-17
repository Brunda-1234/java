package com.te.basic.programs.imp;

public class AmstrongNumber {

	static boolean check(int n) {
		char[] c = String.valueOf(n).toCharArray();
		int s = 0;
		System.out.println(c.length);
		
		for(int i = 0;i< c.length;i++) {
			s = (c[i]^c.length);
			System.out.println(s);
		}
		return false;
	}
	public static void main(String[] args) {
		
		System.out.println(check(371));
	}
}
