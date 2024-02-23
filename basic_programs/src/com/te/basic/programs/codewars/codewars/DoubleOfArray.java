package com.te.basic.programs.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DoubleOfArray {

	
		  public static int[] map(int[] arr) {
		    
		    int[] a = new int[arr.length];
		    for(int i = 0;i< arr.length ;i++){	
		       a[i] = arr[i]*2;
		    }
			return a;

		  }
		  
		  public static int[] mapko(int[] arr) {
			  return Arrays.stream(arr).map(i->i*2).toArray();
		  }
		  
		  public static int[] maokio(int[] arr) {
			  return IntStream.of(arr).map(i->i*2).toArray();
		  }
		  public static void main(String[] args) {
			
			  int[] arr = {1,2,3,4};
			  System.out.println(Arrays.toString(DoubleOfArray.map(arr)));
			  System.err.println(Arrays.toString(DoubleOfArray.mapko(arr)));
		}
		
}
