package codeJava;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		
		int x =123;  // initilization
		long l = 12334566789888L;
		byte b = 122;
		double y = 3.14;  
		boolean z = true;
		char symbol = '@';
		String name = "Bro";
		System.out.println("Hello "+name);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name1 =scanner.nextLine();
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What is your favouriate food? ");
		String food = scanner.nextLine();
		
		System.out.println("Hello "+name1);
	}

}
