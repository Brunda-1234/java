package com.te.basic.programs.ask.interveiw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSort {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(23);
		list.add(37);
		list.add(44);
		list.add(77);
		list.add(87);
//
//		Integer integer = list.stream().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().get();
//		int indexOf = list.indexOf(integer);
//
//		list.stream().sorted((a, b) -> b.compareTo(a)).map(list::indexOf)
//				.forEach(index -> System.out.println(list.get(index) + " @ " + list.indexOf(indexOf)));
////		System.out.println(integer);
////		System.out.println(indexOf);

		List<Integer> asList = Arrays.asList(1, 2, 3, 4);
	
		Integer num = asList.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(0);
//		if(num !=0) {
//			asList.remove(num);
//		}
		list.remove(Integer.valueOf(87));
	System.out.println(list);
//		asList.remove(num);

		 
	}
}
