package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 5, 7, 2, 9, 1 };
		System.out.println(Arrays.toString(bubbleSort(a)));
	}

	private static int[] bubbleSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) { // greater than sort in ascending order or less than sort in descending order
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}   
		}
		return a;
	}

}
