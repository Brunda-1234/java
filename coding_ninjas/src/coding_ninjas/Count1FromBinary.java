package coding_ninjas;

import java.util.Arrays;

public class Count1FromBinary {
	public static void main(String[] args) {
		int n =5;
		int ans = 0 ;
		int placevalue =1;
		int lastdigit=0;
		int count = 0;
		while(n !=0){
			 lastdigit = n%2;
			n = n/2;
			ans = (ans+lastdigit)*placevalue;
			placevalue =placevalue*10;



		}

		String s = String.valueOf(ans);
		System.out.println(s);
		char[]  c= s.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i = 0;i<c.length;i++){
			if(c[i] == '1'){
				count = count+1;
			}
		}
		System.out.println(count);
	}

}
