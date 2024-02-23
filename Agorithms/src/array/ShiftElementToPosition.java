package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ShiftElementToPosition {
	
	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int index =3;
		int newElement = 9;
		int length =a.length;
		int b[] = new int[length+1];
	
			for(int j =0;j<b.length;j++) {
				if(j <index) {
					b[j] =a[j];
				}else if(j == index) {
					b[j]=newElement;
				}else {
					b[j] =a[j-1];
				
				}
				
			}
			
			
			int[] array = IntStream.range(0, length).map(i->(i<index)?a[i]:(i==index)?newElement:a[i-1]).toArray();
			System.out.println(Arrays.toString(array));
			System.out.println(Arrays.toString(b));
		}
		
		
	

}
