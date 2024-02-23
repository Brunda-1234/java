package code.tekion;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {

		int[] a = { 2, 7, 11, 15 };
		int target = 22;

		System.out.println(Arrays.toString(check(a,target)));
		
	}

	private static int[] check(int[] a, int target) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] + a[j] == target) {
                     return new int[] {i,j};
				}

			}
		}
		return null;
	}
}
