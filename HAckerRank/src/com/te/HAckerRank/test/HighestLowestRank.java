package com.te.HAckerRank.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TestDemo {
	private String[] students;
	private int[] rank;
	private int max = Integer.MIN_VALUE;
	private int min = Integer.MAX_VALUE;
	private String highestRankStudent;
	private String lowestRankStudent;

	public TestDemo(String[] s, int[] a) {
		this.students = s;
		this.rank = a;
		populateRanks();
	}

	private void populateRanks() {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < students.length; i++) {
			map.put(students[i], rank[i]);

			if (rank[i] > max) {
				max = rank[i];
				highestRankStudent = students[i];
			}
			if (rank[i] < min) {
				min = rank[i];
				lowestRankStudent = students[i];
			}
		}
	}

	public String getHighestRankStudent() {
		return highestRankStudent;
	}

	public String getLowestRankStudent() {
		return lowestRankStudent;
	}
}

public class HighestLowestRank {
	public static void main(String[] args) {
		String[] s = { "Wilson", "Tesla", "John", "Ronaldo" };
		int[] a = { 3, 1, 2, 8 };
		TestDemo t = new TestDemo(s, a);

		System.out.println("Student with the highest rank: " + t.getHighestRankStudent());
		System.out.println("Student with the lowest rank: " + t.getLowestRankStudent());
	}
}