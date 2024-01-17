package com.te.java.twen.questions;

import java.util.Arrays;
import java.util.Scanner;

public class SwapWithoutUsingThirdVariable {
	 public static int[] swap(int a,int b){
	       
	        a = a+b;
	         b = a-b;
	         a = a-b;

	         int[] res = {a,b};
	         return res;
	}
	 
	 public static void main(String[] args) {
		
		 Scanner sc  = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 sc.close();
		 System.out.println(Arrays.toString(swap(a, b)));
	}
}
