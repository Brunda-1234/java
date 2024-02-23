package CollectionPrectice;

import java.util.Arrays;

public class LeastOccurrenceArray {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 8 };

		int index = 0;
		while (index < a.length) {
			if (index + 1 == a.length) {
				System.out.println(a[index]);
				break;
			} else if (a[index] == a[index + 1]) {
				index += 2;
			} else if (a[index] == a[index - 1]) {
				index++;
			} else {
				System.out.println(a[index]);
				break;
			}
		}

	}

}
