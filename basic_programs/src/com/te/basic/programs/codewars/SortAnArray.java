package com.te.basic.programs.codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAnArray {

	public static int[] sort(int[] n) {

		int[] array = Arrays.stream(n).sorted().toArray();

		int num = Arrays.stream(n).sorted().max().getAsInt();
		System.out.println(num);

		for (int i = 0; i < array.length; i++) {
          if(array[i] == num) {
        	  System.out.println(i +"  Index of the maxixmum Value");
          }
		}
		
		return array;
	}
	
	public List<Integer> sortInt(List<Integer> list){
		Collections.sort(list);
		
		return list;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,43,55,67,23,2};
		System.out.println(Arrays.toString(SortAnArray.sort(a))  );
		
		SortAnArray array = new SortAnArray();
		List<Integer> list = Arrays.asList(1,32,45,54,66);
		
//		System.err.println(array.sortInt(list));
		List<Integer> sortInt = array.sortInt(list);
         System.err.println(sortInt.indexOf(sortInt.get(sortInt.size()-1)) + " Print Last INdex of An List");
	}

}
