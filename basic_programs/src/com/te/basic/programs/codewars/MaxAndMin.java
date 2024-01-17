package com.te.basic.programs.codewars;

import java.util.Arrays;

public class MaxAndMin {
	
	public static int min(int[] list) {
	    
	    return Arrays.stream(list).min().orElse(0); 
	  }
	  
	  public static int max(int[] list) {
	    return Arrays.stream(list).max().getAsInt();
	  }

	  public static void main(String[] args) {
		  int[] a = {20,-12,87,90};
		  System.out.println(MaxAndMin.max(a));
		  System.out.println(MaxAndMin.min(a));
	}
}
