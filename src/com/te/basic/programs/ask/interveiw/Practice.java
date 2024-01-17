package com.te.basic.programs.ask.interveiw;

import java.util.Arrays;
import java.util.Collections;

public class Practice {

	public static int[] reverse(int n) {

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
           a[i] = 1+i;
		}
		
		return Arrays.stream(a)
				.boxed()
				.sorted(Collections.reverseOrder())
				.mapToInt(Integer::intValue)
				.toArray();
		
//		return IntStream.rangeClosed(1, a.length).boxed().sorted(Collections.reverseOrder())
//				.mapToInt(Integer::intValue).toArray();
	}
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(Practice.reverse(5)));
		
	}

}
