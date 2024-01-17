package com.te.basic.programs.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeparateOddAndEven {
	
	
	public static void main(String[] args) {
		
		int[] a=  {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		

		List<Integer> list = new ArrayList<Integer>() ;
		
		IntStream range = IntStream.range(0, a.length -1 );

             List<Integer> collect = range.boxed().collect(Collectors.toList());
             System.out.println(collect);
		
		
			
		
	}
}
