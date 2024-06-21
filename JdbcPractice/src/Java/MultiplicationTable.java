package Java;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
//		// develop a program that prints the multiplication table for a given number.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Welcome to multiplication world");
//		System.out.print("please enter your number ");
//		int num = scanner.nextInt();
//		printMultiplicationTable(num);
		
		//create a program to sum all odd numbersfrom 
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Odd numbers");
		System.out.print("please enter a number");
		int num = input.nextInt();
		int sum = oddSum(num);
		System.out.println("Oddsum till "+ num+" is: " +sum);
		
		
	}
	
	public static void printMultiplicationTable(int num) {
//		int i=1;
//		while(i<=10) {
//			System.out.println(num+" X "+i+" = "+(num * i));
//			i++;
//		}
		
		
		
	}
	
	// create a program to sum all odd numbersfrom 1 to a specified number N.
	
	public static int oddSum(int num) {
		
		int sum =0;
		int i =1;
		while(i<=num) {
			sum+=i;
			i+=2;
		}
		return sum;
	}
	
	
}
