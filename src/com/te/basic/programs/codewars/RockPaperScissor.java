package com.te.basic.programs.codewars;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissor {
	
	public static String rps(String p1, String p2) {
		String s = "";

		if ((p1.equals("rock") || p1.equals("scissors") || p1.equals("paper"))
				&& (p2.equals("rock") || p2.equals("scissors") || p2.equals("paper"))) {

			if ((p1.equals("rock") && p2.equals("scissors")) || (p1.equals("scissors") && p2.equals("paper"))
					|| (p1.equals("paper") && p2.equals("rock"))) {
				s = s + "Player 1 won!";
			} else if ((p1.equals("rock") && p2.equals("paper")) || (p1.equals("scissors") && p2.equals("rock"))
					|| (p1.equals("paper") && p2.equals("scissors"))) {
				s = s + "Player 2 won!";
			} else {
				s = s + "Draw!";
			}
		}

		return s;
	}

	//using ternary operator with or operator
	public static String rpsa(String p1, String p2) {
		if (p1 == p2)
			return "Draw!";
		int i = ((p1 + p2).equals("scissorspaper") ||
				(p1 + p2).equals("paperrock") || 
				(p1 + p2).equals("rockscissors"))? 1: 2;

		return "Player " + i + " won!";

	}

	//using ternary operator
	public static String rpsad(String p1,String p2) {
		//contains() Returns true if and only if this string contains the specified sequence of char values
		return (p1==p2)?"Draw!":"Player "+("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) +" won!";
	}
	
	//using hashMap
	public static String rpdaf(String p1,String p2) {
		if(p1.equalsIgnoreCase(p2))return "Draw!";
		
		Map<String, String> game  = new HashMap<String, String>();
		game.put("scissors", "paper");
		game.put("paper", "rock");
		game.put("rock", "scissors");

                String string = game.get(p1);
                System.err.println(string);
                if(string.equals(p2)) return "Player 1 won!";
                else  return "Player 2 won!";
		
	}
	
	
	public static void main(String[] args) {

		System.out.println(RockPaperScissor.rps("scissors", "rock"));
		System.out.println(rpsa("rock", "scissors"));
		System.err.println(rpsad("rock", "paper"));
		System.out.println(rpdaf("paper", "rock"));
		
		
	}

}
