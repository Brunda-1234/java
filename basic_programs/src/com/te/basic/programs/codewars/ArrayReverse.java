package com.te.basic.programs.codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayReverse {
	
	public static void main(String[] args) {
		System.out.println("hii  dr...input plz,,,");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println("Array with inputs" +Arrays.toString(arr));
		
	
		//by creating new array
		int arr1[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr1[i] = arr[arr.length-i-1];
		}
		System.err.println(" Array reversed : "+Arrays.toString(arr1));

		
		//without creating new array
		for(int k = 0;k < arr.length/2;k++) {
			
			int temp = arr[k];
			arr[k] = arr[arr.length-k-1];
			arr[arr.length-k-1]= temp;
			
		}
		System.out.println(" Array reversed : "+Arrays.toString(arr));
		
		int[] reversedArray = IntStream.range(0, arr.length)
		        .map(i -> arr[arr.length - i - 1])
		        
		        .toArray();
		System.err.println(Arrays.toString(reversedArray));
	}

}
