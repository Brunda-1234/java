package array;

import java.util.Arrays;

public class ArrangeZeroToLast {

	public static void main(String[] args) {
		
		int[] a = {2, 5, 0, 3, 0, 2, 0, 6};
		int count =0;
		int[] res = new int[a.length];
		
		
		for(int i =0;i<a.length;i++) {
			if(a[i] !=0) {
			res[count] =a[i];
			count++;
			}
		}

		System.out.println(Arrays.toString(res));
	}
//output:  [2, 5, 3, 2, 6, 0, 0, 0]

}
