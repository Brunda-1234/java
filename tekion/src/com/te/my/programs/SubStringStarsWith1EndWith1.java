package com.te.my.programs;

import java.util.ArrayList;

public class SubStringStarsWith1EndWith1 {
	
	public static void main(String[] args) {
		String st = "1010101";
		int count = 0;
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < st.length(); i++) {
			for (int j = i + 1; j < st.length(); j++) {
				String substring = st.substring(i, j);
				list.add(substring);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);

			if (string.startsWith("1") && string.endsWith("1")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main1(String[] args) {
		String s="1010101";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1') {
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(j)=='1') {
						count++;
						String substring = s.substring(i, j);
						System.out.println(substring);
					}
					
				}
				
			}
		}
		System.out.println(count);
		
}
}

