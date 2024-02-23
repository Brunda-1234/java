package com.te.basic.programs.codewars;

import java.util.ArrayList;

public class NumberPeopleInBus {
	
	public static int people(ArrayList<int[]> stops) {
		
		int pOnBus= 0;
		int pOffBus= 0;
		for(int[] i:stops) {
			pOnBus = pOnBus +i[0];
			pOffBus = pOffBus +i[1];
			
		}
		return pOnBus-pOffBus;
	}
	
	public static int bus(ArrayList<int[]> stops) {
		return stops.stream().mapToInt(x ->x[0] - x[1]).sum();
	}

	public static void main(String[] args) {
		
		ArrayList<int[] > list = new ArrayList<int[]>();
		list.add(new int[] {10,0});
		list.add(new int[] {9,8});
		list.add(new int[] {4,3});
		list.add(new int[] {2,3});
		System.out.println(NumberPeopleInBus.people(list));
	}
}
