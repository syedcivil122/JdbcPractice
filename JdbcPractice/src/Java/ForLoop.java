package Java;

import java.util.ArrayList;

public class ForLoop {
	public static void main(String[] args) {
		
		// while loop
		int i = 0;
		while(i<100) {
//			System.out.print(i +" ");
			i++;
		}System.out.println();
		
		// for loop
		for(int j=1;j<100;j++) {
//			System.out.print(j+" ");
		}
		
		int[] arr = {5,23,13,5,76,54,12};  // integer array
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		for(int in:arr) {   // for each iteration
			System.out.print(in+" ");
		}
		
		String [] arr1 = { "apple","banna","cherry","grapes","mango","promoganate"};
		
		for(int b=0;b<arr1.length;b++) {
			System.out.print(arr1[b]+" ");
		} 
		System.out.println();
		for(String s:arr1) {
			System.out.println(s);
		}
		
		char [] arr2 = {'a','e','s','t','q','y'};
		
		for(int c=0;c<arr2.length;c++) {
			System.out.print(arr2[c]+" ");
		}
		System.out.println();
		for(char c:arr2) {
			System.out.print(c +" ");
		}
		
		Object[] ob= {'a',"syed",12,12.54,true,12345678L};  // using Object Array
		
		for(int o=0;o<ob.length;o++) {
			System.out.print(ob[o]+" ");
		}
		System.out.println();
		
		for(Object obj:ob) {
			System.out.print(obj+" ");
		}
		
		ArrayList<Object> mixedList = new ArrayList<Object>();  // using collection
		mixedList.add(12);
		mixedList.add(12.12);
		mixedList.add(false);
		mixedList.add(1456789322L);
		mixedList.add(12.34f);
		mixedList.add("esde");
		mixedList.add('q');
		
		for(Object ar:mixedList) {
			System.out.println(ar);
		}
	}
}
