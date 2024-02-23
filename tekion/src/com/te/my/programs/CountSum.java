package com.te.my.programs;

import java.util.HashMap;

public class CountSum {
	public static void main(String[] args) {

		int[] a = { 2,7,6,9,1,3 };
		int sum = 9;
		int count = 0;
		
		usingTwoLoop(a,sum);
//		usingDataStructure(a,sum);
		
	
	HashMap<Integer, Integer> map = new HashMap<>();

	for (int i = 0; i < a.length; i++) {
		int complement = sum - a[i];

		if (map.containsKey(complement)) {
			System.out.println(map.get(complement) + "," + i);
		}

		map.put(a[i], i);
	}
}

//	private static void usingDataStructure(int[] a, int sum) {
//
//        HashMap<Integer, Integer> map =  new HashMap<Integer, Integer>();
//        for(int i=0;i<a.length;i++) {
//        	int diff = sum -a[i];
//        	if(map.containsKey(diff)) {
//        		System.err.println(map.get(diff) +","+i +"  >O(n) time complexity");
//        	}
//        	map.put(i, a[i]);
//        }
//	}

	private static void usingTwoLoop(int[] a, int sum) {
		//timeComplexity O(n^2)  bcz of 2 for loop
		for(int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i] +a[j] ==sum) {
					System.out.println(a[i] +"," +a[j]);
				}
			}
		}
	
		
	}



}
