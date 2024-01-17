package com.te.basic.programs.codewars;

public class FacbookPostLikes {
	
	public static String whoLikesIt(String... names) {
        switch (names.length) {
          case 0: return "no one likes this";
          case 1: return String.format("%s likes this", names[0]);
          case 2: return String.format("%s and %s like this", names[0], names[1]);
          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
          default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
	public static String whoLikesItas(String... names) {
	      int i=0;
	      int count =0;
	       if(names.length == 1){
	          return names[i]+ " likes this";
	        }else if(names.length ==2){
	          return names[i] + " and " +names[i+1] + " like this";
	        }else if(names.length ==3){
	         return names[i]+ ", "+names[i+1] + " and " + names[i+2] +" like this";
	       }else if(names.length >=4){
	         count = names.length-2;
	         return names[i]+", "+names[i+1] +" and "+ count +" others like this";
	       }else{
	            return "no one likes this";
	         }
	      
	      }
	      

}
