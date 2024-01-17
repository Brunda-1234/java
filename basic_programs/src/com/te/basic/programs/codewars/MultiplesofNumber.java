package com.te.basic.programs.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiplesofNumber {

	public static int[] find(int base, int limit) {

		int[] arr = new int[limit];
		int index = 0;
		for (int i = base; i <= limit; i++) {

			if (i % base == 0) {
//				System.err.println(i + "...........");
				arr[index] = i;
				index++;
			} 
		}
		int[] a = Arrays.copyOf(arr, index);
		//copyOf will resize the array to new size
//		System.err.println(Arrays.toString(a));
		return a;
	}
	
	//using java 8
	public static int[] usingStream(int base,int limit) {
		return IntStream.rangeClosed(base, limit).filter(i-> i%base == 0).toArray();
	}
	
	//using the list
	public static int[] usingList(int base,int limit) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = base;i<=limit;i++) {
			if(i% base ==0) {
				list.add(i);
			}
		}
		/* 
		 * mapToInt method -- return the stream of primitive int values
		 * */ 
		int[] array = list.stream().mapToInt(Integer::intValue).toArray();
		return array;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(MultiplesofNumber.find(2, 6)));
		System.err.println(Arrays.toString(MultiplesofNumber.usingStream(2, 9)));
		System.out.println(Arrays.toString(usingList(2, 8)));
	}
}
