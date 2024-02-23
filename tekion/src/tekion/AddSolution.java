package tekion;

public class AddSolution {

	public static void main(String[] args) {

		int n = 146;
		String s = String.valueOf(n);
		char[] charArray = s.toCharArray();
		String res= "";
		
		StringBuilder sb = new StringBuilder(res);
		StringBuilder reverse = sb.reverse();
		System.out.println(reverse.toString());
		
		
        StringBuilder sb1 = new StringBuilder();
		for(int j = 0;j<charArray.length;j++) {
			int digi = Character.getNumericValue(s.charAt(j));
			
			int value =  (digi > 5) ? (digi+2): (digi+3);
			sb1.append(value);
			System.err.println(value);
		}
		System.out.println(sb1.reverse().toString());
		
		int num = 146;
		// output 874

		// n>5 +2
		// n<5 +3
		int rev = 0;
		while (num != 0) {
			int d = num % 10;
//			System.err.println(d);
//			if (d > 5) {
//				rev = rev * 10 + d + 2;
//				num = num / 10;
//			} else if (d < 5) {
//				rev = rev * 10 + d + 3;
//				num = num / 10;
//			}
			
			rev =rev*10 +((d>5)?(d+2):(d+3));
		}
		System.out.println(rev);
	}

}
