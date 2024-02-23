package array;

import java.util.Arrays;

public class dUPLICATE {
	  public static void main(String[] args) {
	       int[] a = {1,2,3,2};
	       int[] res = new int[a.length];
	       int count =0;
	   
	       
	       for(int i=0;i<a.length-1;i++){
	           for(int j = i+1;j<a.length;j++){
	               if(a[i] ==a[j]){
	                  res[count] = a[i];
	                  count++;
	               }
	           }
	       }

	       System.out.println(Arrays.toString(Arrays.copyOf(res,count)));
	    }
}
