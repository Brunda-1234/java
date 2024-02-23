package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int a[] = {2,3,7,6};
		
		int sum = 9;    
		usingDsa(a,sum);
		usingSet(a,sum);
		usingForLoop(a,sum);
		int[][] returnTwoDArray = returnTwoDArray(a,sum);
//		System.out.println(returnTwoDArray);
		for(int[] s:returnTwoDArray) {
		
			System.out.println(Arrays.toString(s));
			//ouput :== [2, 7]
//            			[3, 6]

		}
	} 

	private static int[][] returnTwoDArray(int[] a, int sum) { //time complexity O(n)        
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<int[]> list = new ArrayList<int[]>();
		for(int i =0;i<a.length;i++) {
			int diff =sum -a[i];
			if(map.containsKey(diff)) {
				list.add(new int[] {diff,a[i]});
			}
			map.put(a[i], i);
		}
		
		//convert to 2d array

	    int[][] g = new int[list.size()][2];
		for(int i=0;i<list.size();i++) {  
			g[i] = list.get(i);
			
		}
		return g;
	}

	private static void usingForLoop(int[] a, int sum) {
		//time complexity O(n2)
		for(int i =0;i<a.length;i++) {
			for(int j =i+1;j<a.length;j++) {
				if(a[i] +a[j] ==sum) {
					System.err.println(a[i]+","+a[j]);
				}
			}
		}
		
	}

	private static void usingSet(int[] a, int sum) {
	
		Set<Integer> set = new HashSet<Integer>();  //time complexity  O(n)
		
		for(int i=0;i<a.length;i++) {
			int compliment =sum-a[i];
			if(set.contains(compliment)) {
				System.out.println(compliment +"," +a[i]);
			}
			set.add(a[i]);
		}
	}

	private static void usingDsa(int[] a, int sum) {
		
		Map<Integer, Integer> map = new HashMap<>(); //time complexity O(n)
		
		for(int i =0;i<a.length;i++) {
			int comp = sum -a[i];	
			if(map.containsKey(comp)){
				System.out.println(comp+","+a[i]);
			}
			map.put(a[i], i);
	}
	}
}
