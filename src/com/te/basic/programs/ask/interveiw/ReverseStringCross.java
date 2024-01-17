package com.te.basic.programs.ask.interveiw;

public class ReverseStringCross {
	public static void main(String[] args) {
		String demo = "hello brunda how are you";
		String[] split = demo.split(" ");
		int i = 0;
		int j = split.length - 1;
		while (i < split.length / 2) {
			System.out.print(reverse(split[j]) + " ");
			System.out.print(reverse(split[i]) + " ");
			++i;
			--j;

		}
		if (split.length % 2 != 0) {
			System.out.print(reverse(split[i]) + " ");
		}
	}

	private static String reverse(String string) {
		String result = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			result += string.charAt(i);
		}
		return result;
	}
}