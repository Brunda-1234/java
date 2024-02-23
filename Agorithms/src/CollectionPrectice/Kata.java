package CollectionPrectice;

import java.util.Arrays;

public class Kata {
	public static int[] digitize(long n) {
		// Code

		String std = n+"";
//		String s = "";
       int[] res = new int[std.length()];
       int i =0;
		while (n > 0) {
			int temp = (int)n % 10;
			res[i] =temp;
			n = n / 10;
			i++;
		}
//		System.out.println(s);
//		int parseInt = Integer.parseInt(s);
		System.out.println(Arrays.toString(res));
		return res;
		
	}
	
	public static void main(String[] args) {
		
		digitize(12345);
	}
}