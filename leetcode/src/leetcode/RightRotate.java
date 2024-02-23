package leetcode;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7};
		int k=3;
		
		for(int i=0;i<k;i++) {
			int j,last ;
			last = a[a.length-1];
			for(j=a.length-1;j>0;j--) {
				a[j] = a[j-1];
			}
			a[j] =last;
		}
		
		System.out.println(Arrays.toString(a));
	}
	                                                                                                                                  
}
