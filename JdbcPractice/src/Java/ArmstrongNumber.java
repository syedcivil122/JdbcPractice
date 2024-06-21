package Java;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// create a program of Armstrong Number
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Armstrong Number");
		System.out.print("please enter your number: ");
		int num = input.nextInt();
		boolean isArmstong = isArmstong(num);
		if(isArmstong) {
			System.out.println("Your Number is Armstrong");
		}else {
			System.out.println("Your number is not Armstrong");
		}
			
	}
	
	public static boolean isArmstong(int num) {
		int noOfDigits = noOfDigits(num);
		int numCopy = num;
		System.out.println("No of Digits:" + noOfDigits);
		int finalNumber =0;
		while(num > 0) {
			int lastDigit = num % 10;
			num /= 10;
			finalNumber += pow(lastDigit, noOfDigits);
		}
		return finalNumber == numCopy;
		
	}
	public static int pow(int num1, int num2) {
		int result = num1;
		int i =1;
		while(i < num2) {
			result *= num1;
			i++;
		}
		return result;
	}
	
	public static int noOfDigits(int num) {
		int digits = 0;
		while (num > 0) {
			digits++;
			num /= 10;
		}
		return digits;
		
	}
}
