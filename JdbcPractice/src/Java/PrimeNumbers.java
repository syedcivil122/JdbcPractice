package Java;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		
		// create a program of prime numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Prime Numbers Checker");
		System.out.print("please enter your number: ");
		int num = input.nextInt();
		boolean isPrime = isPrime(num);
		if(isPrime) {
			System.out.println("Your number is prime");
		}else {
			System.out.println("Your number is not prime");
		}
		
	}
	
	public static boolean isPrime(int num) {
		int i =2;
		while (i < num) {
			if(num % i == 0) {
				return false;
			}
			i++;
		}
		return true;			
	}
}
