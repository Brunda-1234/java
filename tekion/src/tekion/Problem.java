package tekion;

public class Problem {
	
	public static void main(String[] args) {
		
		int[] a= {-14,33,51,94,26,14,36,65,90};
		
		for(int i=0;i<a.length;i++) {
			
			int b = a[i];
			check(b);
		}
		
	}

	private static String check(int b) {
	
//		String res = "";
//		while(b != 0) {
//			int d = b%10;
//			System.err.println(d);
//			res = (d == 0||d ==-1)? "Present": "NotPresent";
//			b = b/10;
//			return res;
//		
//
//		}
////	return res;
//		return null;
		
		String res = "";
	    while (b != 0) {
	    	
	        int d = b % 10;  // Get the last digit
	       
	        if (d == -1) {
	            res = "Present";
	            System.out.println(res);
	        } else {
	            res = "NotPresent";
	            System.out.println(res);
	        }

	        b = b / 10;  // Move to the next digit
	        System.out.println(b);
	    }
		return null;
	}

}
