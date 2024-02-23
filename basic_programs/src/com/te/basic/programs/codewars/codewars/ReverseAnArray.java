package com.te.basic.programs.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseAnArray<E> {

	public static int[] reverse(int n) {
		int[] num = new int[n];
		int[] res = new int[n];
		for (int k = 0; k < n; k++) {
			num[k] = k + 1;
			 List<int[]> asList = Arrays.asList(num);
			Collections.reverse(asList);
			System.out.println(asList);
			for (int[] is : asList) {
				System.out.println(Arrays.toString(is)+"????????");
			}
		}
		System.err.println(Arrays.toString(num));

		for (int i = num.length - 1; i > 0; i--) {
			for(int y = 0;y<res.length-1;y++) {
				res[y]=num[i];
			}
//			res[0] = num[i];
		}

		return res;
	}
	
	public static ArrayList<Integer> add(int d) {
		ArrayList<Integer> arrayList = new ArrayList();
		for(int i=1;i<d;i++) {
			arrayList.add(i);
		}
		Collections.reverse(arrayList);	
		return arrayList;
		}


	public static void main(String[] args) {

		int[] reverse = ReverseAnArray.reverse(5);
		System.out.println(Arrays.toString(reverse));
		ArrayList<Integer> rev = add(6);
		System.out.println(rev);

		
	}

}
