package com.te.scratch.keywords;

import java.util.ArrayList;

public class EnhancedForLoopExample {
	
	public static void main(String[] args) {
	//iterates using the array	
		System.err.println("using the Arrays");
		String [] s = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		for(String g : s) {
			System.out.println(g);
		}
		System.out.println();
		
	//iterates using the collection
		System.err.println("Using the Collection");
		ArrayList<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		
		for(String la : list) {
			System.out.println(la);
		}
		System.out.println();
		
		//NESTED For eachLOOP
		System.err.println("Nested Foreach for TWoDimentionalArrays:");
		int[][] twoArray = {{1,2,3,4},{5,6,7,8}};
		
		for(int[] oneArray : twoArray) {
			System.out.print("[");
			for(int n : oneArray) {
				System.out.print(n);
			}
			System.out.println("]");
		}
	}

}
