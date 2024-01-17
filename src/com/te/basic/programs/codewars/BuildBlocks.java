package com.te.basic.programs.codewars;

public class BuildBlocks {
	
	static long blocks(long m) {
     
		long count = 0;
		long n = 1;
		while(count < m) {
			count += n*n*n;
			if(count == m) {
				return n;
			}
			n++;
		}
		return -1;
		

	}
	public static void main(String[] args) {

		System.out.println(blocks(40539911473216L)); //3568
		System.out.println(blocks(135440716410000L)); //4824
	}
}
