package techwithjatin;

//check the Array is monotonic
public class Monotonic {
	
	public static void main(String[] args) {
		int a[] = {1,2,2,3,9,1};
	System.out.println(check(a));
		
	}

	private static boolean check(int[] a) {
		boolean increase = true;
		boolean decrease = true;
		
		for(int i =0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				decrease = false;
			}else if(a[i]>a[i+1]) {
				increase = false;
			}
		}
		return increase||decrease;
	}

}
