 package Java;

import java.util.Scanner;

public class reverseTheDigits {
	public static void main(String[] args) {
		// create a program of Reverse the Digits
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Reverse the Digits");
		System.out.print("please enter your number: ");
		int num = input.nextInt();
		int reverse = reverse(num);
		System.out.println("Reverse of your number is "+ reverse);
	}
	
	public static int reverse(int num) {
		int newNum = 0;
		while(num > 0) {
			int digit = num % 10;
			newNum = newNum * 10 + digit;
			num /= 10;
		}
		return newNum;
		
	}
}
