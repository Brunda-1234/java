package com.te.basic.programs.codewars;

public class TwiceTheAge {

	public static int age(int dad, int son) {
		int count = 0;
		while (true) {
			if (2 * son == dad) {
				break;
			}
			if (2 * son > dad) {
				--son;
				--dad;
				count++;
			} else if (2 * son < dad) {
				++son;
				++dad;
				count++;
			}
		}
		return count;
	}
	
	

	public static int ageL(int dad, int son) {
		
		return Math.abs(dad - son*2);
	}
	
	public static void main(String[] args) {

		System.out.println(age(30, 7));
		System.err.println(ageL(40, 7));
	}

}
