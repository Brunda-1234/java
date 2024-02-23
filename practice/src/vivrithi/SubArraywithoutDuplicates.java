package vivrithi;

import java.util.Arrays;

public class SubArraywithoutDuplicates {
	
	public static void main(String[] args) {
		int a[] = {0};
		
	   check(a);
	   check1(a);
		
		
	}

	private static void check1(int[] a) {
	     for (int i = 0; i < a.length; i++) {
	            for (int j = i; j < a.length; j++) {
	                System.err.println(Arrays.toString(Arrays.copyOfRange(a, i, j + 1)));
	            }
	        }
	     System.err.println(Arrays.toString(new int[] {}));
	}

	private static void check(int[] a) {
		for(int i=0;i<a.length;i++) {   //iterating the for 3 times 0,1,2
			 for(int j =i;j<a.length;j++) { //iterating for according to i value
				 for(int k =i;k<=j;k++) {  //iterating acc to ith value and until jth end point
					 
					 System.out.print("[" +a[k]+ "]");
				 }
				 System.out.println();
			 }
		}
		
       System.out.println(Arrays.toString(new int[] {}));
		
	}
	
}
