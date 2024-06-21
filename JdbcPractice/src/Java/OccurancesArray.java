package Java;

import java.util.Scanner;

public class OccurancesArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Array Occurances\n");
		int [] numArr = ArrayUtility.inputArray();
		System.out.println("Now enter the number you want to find: ");
		int num = input.nextInt();
		int occurrences = noOfOccurances(numArr, num);
		System.out.println("Your element was found " + occurrences + " times in");
	}
	
	public static int noOfOccurances(int[] numArr, int num) {
		
		
		return num;
		
	}

}
