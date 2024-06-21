package Java;

import java.util.Scanner;

public class Return {
	public static void main(String[] args) {
		greet();
		
		int a = readNumber()+1;
		int b = readNumber()+2;
		
		int sum = a+b;
		System.out.println("Sum of the numbers is : "+sum);	
		
	}
	
	public static int readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = input.nextInt();
		return number;
		
	}
	
	public static void greet() {
		System.out.println("Welcome to Method calling");
	}

}
