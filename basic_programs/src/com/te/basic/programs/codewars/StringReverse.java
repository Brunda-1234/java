package com.te.basic.programs.codewars;

import java.util.Arrays;

public class StringReverse {
	
	static String[] reverse(String s) {
		String[] h = s.split(" ");
		String[] b = new String[h.length];
		int num =0;
		for(int i = h.length-1;i>=0;i--) {
			String string = h[i];
			StringBuilder sb = new StringBuilder(string);
			StringBuilder reverse = sb.reverse();
			b[num]=reverse.toString();
			num++;
		
		}
		return b;
	}
	static String[] swap(String[]  k) {
//		String[] n = new String[k.length];
		int num= 1;
		for(int i =1;i<k.length-1;i++) {
			String temp = "";
			temp = k[i];
			k[i] = k[k.length-i];
			k[k.length-i]=temp;
			
		}
		for(int i =2;i<k.length-1;i++) {
			String temp = "";
			temp = k[i];
			k[i] = k[k.length-num];
			k[k.length-num]=temp;
			num++;
		}
		return k;
		
	}
	
	public static void main(String[] args) {
		
		String s = "Hello Brunda How are you";
		String[] gh = reverse(s);
		System.out.println(Arrays.toString(swap(gh)));	
 
		
		
	}
}
