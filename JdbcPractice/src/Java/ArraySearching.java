package Java;

import java.util.Scanner;

public class ArraySearching {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] serh = {19,20,43,21,6,43,8,6,45,98,22};
		System.out.println("Welcome to Array Search");
		System.out.println("Please enter the number");
		int num = input.nextInt();
		boolean isFound = isFound(serh,num);
		if(isFound) {
			System.out.println("Your number was found in array");
		}else {
			System.out.println("Your number is not found in array");
		}
		
		
	}
	
	public static boolean isFound(int[] serh, int num) {
		int index = 0;
		while(index < serh.length) {
			if(serh[index] == num) {
				return true;
			} index++;
			
		}
		return false;
		
	}
	
	

}
