package com.te.java;

public class One {
public static void main(String[] args) {
	
	int i = 0;
	int j = i++ + ++i + --i + i++;
	System.out.println(i);
	System.out.println(j);
	
	Integer c = 100, d = 100;
	System.err.println(c == d);

	Integer a = 128, b = 128;
	System.err.println(a == b);
}
}
