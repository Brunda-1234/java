package com.te.tekion.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		int a[] = { 2,4, 4, 3, 7, 8 };
		int sum =5 ;
		int b = 10;
		int c = 30;
		int d = 20;
		
//		b = 20 ; d = 30 ; c = 10
		 b= b+c+d;
		 d = b-c;
//		 c = 

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			
				sum = sum =a[i];
				if(a[i] >= sum)
					sum -=a[i];
	
					sum = 0;
			map.put(i, a[i]);
		}

		System.out.println(map);
	}

}
