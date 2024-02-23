package iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SortFromZero {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 5, 3, 0, -1, -5, -2, -3);
		List<Integer> one = new ArrayList<Integer>();
		List<Integer> two = new ArrayList<Integer>();

		for (int a : asList) {
			System.out.println(a);
			if (a > 0) {

				one.add(a);

			} else {
				two.add(a);
			}

		}
		System.out.println(one);
		List<Integer> collect1 = one.stream().sorted().collect(Collectors.toList());
		List<Integer> collect2 = two.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		collect1.addAll(collect2);
		System.out.println(collect1);

		check(asList);

	}

	public static void check(List<Integer> list) {

		List<Integer> collect = list.stream().filter(a -> a > 0).sorted().collect(Collectors.toList());
		List<Integer> collect2 = list.stream().filter(b -> b <= 0).sorted((x, y) -> y.compareTo(x))
				.collect(Collectors.toList());
		collect.addAll(collect2);
		System.out.println(collect);
	}
	
	public static void  checkTwo(List<Integer> list) {
		
		
	}

}
