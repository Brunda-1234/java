package com.te.HAckerRank;

public class Test {
	public static void main(String[] args) {
//here we need to add 5+6+3+4 = 18		
		String input = "India Won the 56 balls and 34 runs";
		
		char[] c = input.toCharArray();
		int sum = 0;
		String s = "";
		for(int i =0;i<c.length;i++) {
			
			if(Character.isDigit(c[i])) {
				System.out.println(c[i]);
				s +=c[i];
			}
			
		}

        System.out.println(s);
        String[] split = s.split("");
        for(int j = 0;j<split.length;j++) {
        	sum +=Integer.parseInt(split[j]);
        }
        System.out.println(sum);
	}

}
