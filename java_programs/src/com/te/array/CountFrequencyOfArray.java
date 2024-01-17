package com.te.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfArray {
	
	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 4, 1, 2, 3, 4, 5, 2, 2,5 };
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0;i<array.length;i++) {
			if(map.containsKey(array[i])) {
				Integer ij = map.get(array[i]);
				map.put(array[i], ij +1);
			}else {
				map.put(array[i], 1);
			}
		
		}
		System.out.println(map);
		 int max = Integer.MIN_VALUE;
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			
		   Integer value = entry.getValue();
		   if(value > max) {
			   max = value;
		   }
		   
		}
		System.out.println(max);
		for(Entry<Integer, Integer> entry2 : map.entrySet()) {
			if(max == entry2.getValue()) {
				System.err.println(entry2.getKey() + "this element is repeated for " +entry2.getValue());
			}
		}
		 Integer[] array2 = Arrays.stream(array).boxed().toArray(Integer[] :: new);
		 
		 Map<Integer,Long> collect = Arrays.stream(array2).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 collect.forEach((element,frequnecy)-> System.out.println("Elements:" + element +"FrequncyCount:" + frequnecy));
	}

}
