package com.te.basic.programs.numericals;

import java.util.Scanner;

public class DisplayNNumbers {
public static void main(String[] args) {
	
	System.out.println("Enter the Number:--");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	for(int i = 1;i<=n;i++) {
		System.out.println(i);
	}
}
}
