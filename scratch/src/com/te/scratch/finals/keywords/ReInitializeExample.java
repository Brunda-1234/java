package com.te.scratch.finals.keywords;

public class ReInitializeExample {

	final int i = 10;

	void hii() {
//		i++;
		int j = i; //initialize the other variable
		System.out.println(i);
		System.out.println(j + " Reinitialized One");
	}

	public static void main(String[] args) {

		ReInitializeExample ex = new ReInitializeExample();
		ex.hii();
	}
}
