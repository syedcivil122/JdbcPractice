package Java;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to day of the week detector");
		System.out.println("Enter your day in number: ");
		int day = input.nextInt();
		newSwitch(day);
//		oldSwitch(day);
		
			
			
	}
	
	public static void newSwitch(int day) {
		String dayStr = switch (day) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thusday";
		case 5 -> "Friday";
		case 6, 7 -> "Holiday";
		
		default -> "Invalid";
		
		};
		System.out.println(dayStr);
	}
	
	public static void oldSwitch(int day) {
		switch(day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invaild day");
			break;
		}
	}
}
