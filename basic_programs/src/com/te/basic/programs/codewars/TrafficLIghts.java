package com.te.basic.programs.codewars;
//import com.google.common.collect.ImmutableMap;
import java.util.Map;
public class TrafficLIghts {

	public static String light(String current) {
		return(current.equals("green")?"yellow"
				:(current.equals("yellow"))?"red":(current.equals("red"))?"green":null);
	}
	
	
//	private static final Map<String, String> LIGHTS = ImmutableMap.of(
//            "red", "green",
//            "green", "yellow",
//            "yellow", "red"
//    );
//
//  public static String updateLight(String current) {
//      return LIGHTS.get(current);
//  }
    public static void main(String[] args) {
		
    	System.out.println(TrafficLIghts.light("yellow"));
	}
	
}
