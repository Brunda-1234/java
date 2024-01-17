package com.te.basic.programs.imp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSeries {
	
	static int[] series(int n) {
		
		int n1=0,n2=1;
		int[] a = new int[n];
		a[1] = 1;
		for(int i =2;i<=n-1;i++) {
			a[i] = n1+n2;
			n1 =n2;
			n2 =a[i];
		}
		return a;
		
	}
	
	//using java 8
	static void serie(int n) {
		/*
		 * iterate()
		 * Returns an infinite sequential ordered Stream produced by iterative
		 * application of a function f to an initial element seed,producing a Stream consisting of seed, 
		 * f(seed), f(f(seed)), etc. 
		 * 
		 * Type Parameters:<T> the type of stream elements
		 * 
		 * Parameters: 
		 *      seed the initial element
		 *      f a function to be applied to the previous element to produce a new element
		 *      
		 *      Returns:a new sequential Stream
		 */

    	 Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
			.limit(10)
			.forEach(x->System.err.println(x[0]));
    	 
    	 String collect = Stream.iterate(new int[] {0,1},t->new int[] {t[1],t[0]+t[1]})
    	 .limit(10)
    	 .map(t->t[0])
    	 .map(String::valueOf)
    	 .collect(Collectors.joining(","));
	}
	
	static String ser(int n) {
      return   Stream.iterate(new int[] {0,1},t->new int[] {t[1],t[0]+t[1]})
         .limit(10)
         .map(t->t[0])
         .map(String::valueOf)
         .collect(Collectors.joining(","));
      
      /*
       * output:== 
       * 0,1,1,2,3,5,8,13,21,34
       */
	}
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(series(23)));
        serie(10);
        System.out.println(ser(12));

	}

}
