package com.te.basic.programs.ask.interveiw;

public class FibonnaciSeries {
	
	public static void main(String[] args) {
		int n1 = 0,n2=1;
		int[] a  = new int[10];
		a[1]=1;
		for(int i=2;i<10;i++) {
			a[i] = n1+n2;
			n1=n2;
			n2=a[i];
			System.out.print("n1 is : "+n1);
			System.out.println(" ,,,,,,,,,,n2 is : "+n2);
			
		}
		for(int i =0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
	


	}

}
