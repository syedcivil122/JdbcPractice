package Java;

import java.util.Scanner;

public class SumofDigits {
	 public static void main(String[] args) {
		//create a program to sum of digits 
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Sum of Digits");
		System.out.print("please enter a number");
		int num = input.nextInt();
		int sum = sumDigits(num);
		System.out.println("Sum of digits: "+sum);
		
	}
	 
	 public static int sumDigits(int num) {
		 int sum =0;
		 while (num>0) {
			 sum += num % 10;
			 num /=10;
		 }
		 
		 return sum;
	 }
}
