package com.te.my.programs;



public class Divide {
	public static void main(String[] args) {
//		int numerator = 35;
		int deno = 3;
		int sub = 35;
		int count = 0;
		int count2 = 0;
		String answer = "";
		
		while (sub > deno) {
		sub = sub - deno;
		count++;
		}
		System.out.println(count);
		
		while (sub != 20) {
		sub = sub + count;
//		System.out.println(sub);
		}
		
		answer = answer + count;
		
		while (sub > deno) {
		sub = sub - deno;
		count2++;
		}
		
		answer = answer + "." + count2 + count2;
		System.err.println(answer);
	}


}