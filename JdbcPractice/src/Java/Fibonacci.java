package Java;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// create a program of Fibonacci
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Fibonacci");
		System.out.print("please enter your number: ");
		int num = input.nextInt();
		System.out.print("Here is the fibonacci ");
		fibonacci(num);
	}
	
	public static void fibonacci(int num) {
		if(num < 0) return;
		System.out.println("0 ");
		if(num == 0) return;
		
		int first =0, second =1;
		while (first + second <= num) {
			int third =first + second;
			System.out.print(third + " ");
			first = second;
			second = third;
		}
		
	}

}
