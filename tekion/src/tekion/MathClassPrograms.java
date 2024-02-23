package tekion;



public class MathClassPrograms {
	private static String check(int a[]) {
		for (int i = 0; i < a.length; i++) {

			int b = a[i];

			while (b != 0) {
				int d = b % 10; // 4
				if (d == 0 || d == -1) {
				return "Present";
					
				}
				b = b / 10;
			}
		}
		return "Not Present";
	}

	public static void main(String[] args) {

		int[] a = {14, 33, 51, 94, 26, 14, 36, 65, 90};
		System.out.println(check(a));

	}

}
