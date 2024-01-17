package com.te.basic.programs.codewars;

import java.util.Arrays;

public class InvertSet {
	
	
	public static int[] invert(int[] array) {

		int[] a = new int[array.length];
	    for(int i=0;i<array.length;i++) {
	    	a[i] = ~(array[i] -1);
//	    	a[i] = array[i]*(-1);
	    }
		
		return a;
	}
	
	public static int[] inverta(int[] array) {
		return array;
//		return Arrays.stream(array).map(i-> i* (-1)).toArray();
//		return Stream.
	}
	
	
	
	public static void main(String[] args) {
		
		int[] array = {1,-2,4,-3,6,-7};
		System.out.println(Arrays.toString(InvertSet.invert(array)));
		System.err.println(Arrays.toString(InvertSet.inverta(array)));
	}

}
