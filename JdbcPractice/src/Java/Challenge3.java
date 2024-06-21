package Java;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge3 {

  // create  a program using do while loop
	public void password() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Set your Password ");
		String password;
		do {
			System.out.println("please enter a password ");
			password = input.next();
		} while(!isValidPassword(password)); 
			System.out.println("Thanks for entering a valid password");
		
		
	}
	
	public boolean isValidPassword(String password) {
		return password.length() > 6;
	}
	
	public void GuessingGame() {
		Scanner input = new Scanner(System.in);
		int num = 5,guess;
		System.out.println("Welcome to number guessing game ");
		do {
			System.out.print("please guess tthe number between 0 and 10 ");
			guess=input.nextInt();
		}while(num != guess);
		System.out.println(" you have successfully guessed the number");
	}

	public void multiplicationTable() {
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to multiplication");
		System.out.print("please enter a number ");
		int num= input.nextInt();
		
		for(int i=1; i<=10;i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}
	}
	
	public void primeNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to Prime number");
		System.out.print("please enter a number ");
		int num= input.nextInt();
		System.out.println("your number is " + (isPrime(num) ? "Prime":"Not Prime"));
		
	}
	public boolean isPrime(int num) {
		for(int i =2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public void maxNumber() {
		
		System.out.println("welcome to finding maximum ");
		int arr[]= ArrayUtility.inputArray();
		
		int max = arr[0];
		
		for(int num:arr) {
			if(max < num) {
				max = num;
			}
		}
		System.out.println(max);
	}
	
//	 create a program using break to read input from the user in lop and break
	public void readInputs() {
		Scanner input= new Scanner(System.in);
		while(true) {
		System.out.print("Enter your command: ");
		String command = input.next();
			
		    if(command.equals("exit")) {
//			if(command.equalsIgnoreCase("exit")) { 
				break;
			}
		
		}System.out.println("you have successfully exited.");
	}
	
	
	// create a program sum all the positive numbers using continue keyword
	public void SumPositive() {
		Scanner input = new Scanner(System.in);
		int[] number = ArrayUtility.inputArray();
		
		int sum = 0;
		for(int num:number) {
			if(num<0) {
				continue;
			}
			sum +=num;
		}System.out.println("the sum of positive number is: "+ sum);
	}
	
	// create a program using continue to print only even numbers
	public void printEven() {
		for(int i=0; i<= 100;i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
	
	// create a program using recursion FibonacciSeries
	public void fibonacciRecursion() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to fibonacciSeries ");
		System.out.print("Please enter a number ");
		
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(fibonnacci(i)+" ");
		}
	}
	
	public int fibonnacci(int position) {
		if(position == 1) {
			return 0;
		}
		if(position == 2) {
			return 1;
		}
		return fibonnacci(position - 1) +fibonnacci(position - 2);
		
	}
	
	// create a program using recursion to check if a string is palindrome 
	public void  palindromeRecursion() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to palindrome");
		System.out.print("please enter a string ");
		String s = input.next();
		System.out.println("your string is " + (isPalindrome(s) ? "Palindrome" : "not a palindrome"));
		
	}
	
	public boolean isPalindrome(String str) {
		if(str.length() <= 1) {
			return true;
		}
		int lastPos = str.length() - 1;
		if(str.charAt(0) != str.charAt(lastPos)) {
			return false;
		}
		String newstr = str.substring(1, lastPos);
		return isPalindrome(newstr);
	}
	public static void main(String[] args) {
		Challenge3 c = new Challenge3();
//		c.password();88
//		c.GuessingGame();
//		c.multiplicationTable();
//		c.primeNumber();
//		c.maxNumber();
//		c.readInputs();
//		c.SumPositive();
//		c.printEven();
//		c.fibonacciRecursion();
		c.palindromeRecursion();
	}

}
