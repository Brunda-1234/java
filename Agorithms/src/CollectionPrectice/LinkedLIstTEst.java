package CollectionPrectice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LinkedLIstTEst {

	public static void main(String[] args) {
	//	LinkedList<Integer> list = new LinkedList<>();
		List<Integer>list=new ArrayList<Integer>();
		// Adding elements to the linked list
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
//		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		Collections.swap(list, 1, 2);
		Collections.swap(list, 3, 5);
		Collections.swap(list, 6, 9);
		
		System.out.println(list);
	}
	
//	output: ==[1, 3, 2, 6, 5, 4, 10, 8, 9, 7]

}
