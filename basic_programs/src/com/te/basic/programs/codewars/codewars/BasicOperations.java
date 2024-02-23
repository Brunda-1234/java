package com.te.basic.programs.codewars;

public class BasicOperations {
	
	
	public static Integer basicMath(String op, int v1, int v2) {
		Integer result = 0;
		switch (op) {
		case "+":
			result = v1 + v2;
			System.out.println(result);
			break;
		case "-":
			result = v1 - v2;
			System.out.println(result);
			break;
		case "*":
			result = v1 * v2;
			System.out.println(result);
			break;
		case "/":
			result = v1 / v2;
			System.out.println(result);
			break;
		default:
			System.out.println("Operation");
			break;

		}
		return result;
	}
	
	public static Integer basicOperation(String op,int v1,int v2) {
		
		switch(op) {
		
		case "+" : return v1+v2;
		case "-": return v1-v2;
		case "*": return v1*v2;
		case "/" : return v1/v2;
		}
		return 0;
		
	}

	public static void main(String[] args) {
		
		BasicOperations.basicMath("+", 2, 3);
		System.out.println(BasicOperations.basicOperation("-", 5, 2));
	}
}