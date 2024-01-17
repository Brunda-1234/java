package com.te.HAckerRank.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Test {

	String[] students;
	int[] rank;
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	String key;

	public Test(String[] s, int[] a) {
		this.students = s;
		this.rank = a;

	}

	public String high(String[] std, int[] rank) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < std.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				map.clear();
				if (rank[i] > max) {
					max = rank[i];
				}
				
			}
		}

		for (Entry<String, Integer> entry : map.entrySet()) {

			if (entry.getValue() == max) {
				key  = entry.getKey();
			}

		}
		return key;
	}

	public String low(String[] std, int[] rank) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < std.length; i++) {
			for (int j = 0; j < rank.length; j++) {

				if (rank[i] < min) {
					min = rank[i];
				}

			}
		}

		for (Entry<String, Integer> entry : map.entrySet()) {

			if (entry.getValue() == max) {
				key =  entry.getKey();
			}

		}
		return key;
	}

}

public class HighestLowestWithoutParamters {

	public static void main(String[] args) {
		String[] s = { "wilson", "Tesla", "Jhon", "Ronaldo", "CR7", "Kalam" };
		int[] a = { 3, 1, 2, 8, 20, 0 };
		Test t = new Test(s, a);
		
		System.out.println(t.high(s, a));
		System.out.println(t.low(s, a));

	}
}
