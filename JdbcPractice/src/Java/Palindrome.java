package Java;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// create a program of Palindrome
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Palindrome number");
		System.out.print("please enter your number: ");
		int num = input.nextInt();
		boolean isPalidrome = isPalidrome(num);
		if(isPalidrome) {
			System.out.println("Your number is a palindome number");
		}else {
			System.out.println("Your number is not a palindrome number");	
		}
		
	}
	public static boolean isPalidrome(int num) {
		int reverse = reverse(num);
		return num == reverse;
		
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
