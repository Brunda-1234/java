package com.te.scratch.keywords;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		System.out.println("ENter the input:");
		Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("invalid");
			break;
		}
		
		String week = scanner.next();
		switch(week) {
		case "monday" : System.out.println("Monday");
		break;
		case "tuesday" : System.out.println("tuesday");
		break;
		case "wednesday" : System.out.println("wednesday");
		break;
		case "thursday" : System.out.println("thursday");
		break;
		case "friday" : System.out.println("friday");
		break;
		case "saturday" : System.out.println("saturday");
		break;
		case "sunday" : System.out.println("sunday");
		break;
		default : System.out.println("invalid");
		break;
		}
	}
}

