package String;

import java.util.stream.Collectors;

public class PunchCount {

	public static void main(String[] args) {
		
		String s = "Br.jb-ljk]op,";
		int count=0;
	    for(int i=0;i<s.toCharArray().length;i++) {
	    	if(Character.isLetterOrDigit(s.charAt(i))) {
	    		continue;
	    
	    	}else if(Character.isWhitespace(s.charAt(i))) {
	    		continue;
	    	}else {
	    		count++;
	    	}
	
	    	if(s.charAt(i) == '.'||s.charAt(i) =='-'||s.charAt(i)==']'||s.charAt(i)==',') {
	    		
				count++;
	    	}
	    	
	    }
	    
	    System.out.println(count);
	     Long collect = s.chars().filter(i-> !Character.isLetterOrDigit(i) && Character.isWhitespace(i))
	    		.mapToObj(String::valueOf).collect(Collectors.counting());
	    System.err.println(collect);
	}
}
