package com.te.basic.programs.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountByX  {

	  public static int[] countBy(int x, int n){
		  System.err.println(x + " " +n);
		  
		    int[] a = new int[n];
		    for(int i = 0;i<a.length;i++){
		          a[i] = (i+1)*x;
		      }
		      
		    
		    return a;
		  }
	  
	  public static int[] count(int x,int n) {
		  return IntStream.rangeClosed(1, n).map(i-> i*x).toArray();
	  }
	  
	  public static void main(String[] args) {
		
		  System.out.println(Arrays.toString(CountByX.countBy(2, 5)) );
		  System.err.println(Arrays.toString(CountByX.countBy(1, 10)));
	}
}
