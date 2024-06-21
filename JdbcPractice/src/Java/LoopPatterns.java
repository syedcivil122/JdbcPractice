package Java;

import java.util.Scanner;

public class LoopPatterns {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Loop Pattern");
		System.out.print("Please enter the no of rows: ");
		int rows = input.nextInt();
		printRightHalfPyramid(rows);
		printReverseRightHalfPyramid(rows);
		printLeftHalfPyramid(rows);
	}
	public static void printLeftHalfPyramid(int maxRows) {
		System.out.println("\nHere is LefttHalfPyramid");
		int rows =  maxRows;
		while (rows > 0) {
			//This row prints spaces
			int j = 0;
			while (j < rows - 1) {
				System.out.println("  ");
				j++;
			}
			// This loop prints stars
			int i =0;
			while(i <= maxRows-rows) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
	}
	public static void printReverseRightHalfPyramid(int maxRows) {
		System.out.println("\nHere is ReversetHalfPyramid");
		int rows =  maxRows;
		while (rows > 0) {
			int i =0;
			while(i < rows) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
	}
	
	public static void printRightHalfPyramid(int maxRows) {
		System.out.println("\nHere is RightHalfPyramid");
	    int rows =0;
	    while(rows<maxRows) {
	    	System.out.print("*");
	    	int i=0;
	    	while(i<rows) {
	    		System.out.print(" *");
	    		i++;
	    	}System.out.println();
	    	rows++;
	    }
	}
}
