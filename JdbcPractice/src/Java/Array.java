package Java;

public class Array {
	public static void main(String[] args) {
		int[] myarr = new int[5];  // declare the length of array
		myarr[0] = 12;
		myarr[4] = 20;
		myarr[2] = 30;
		myarr[1] = 50;
		myarr[3] = 13;
//		System.out.print(myarr+"\n");
//		System.out.println(myarr[4]);
//		System.out.println(myarr[2]);
//		System.out.println(myarr[3]);
//		System.out.println(myarr[1]);
//		System.out.println(myarr[0]);
//		System.out.println(myarr[1]);
		
		int[] arr = {19,23,12,56,32}; // initilization the array data
		int index = 2;
//		System.out.println(arr[0]);
//		System.out.println(arr.length);
//		System.out.println(arr[index]);
//		System.out.println(arr[4]);
//		System.out.println(arr[3]);
		
		//Array Traversal
		int i=0;
		while(i<arr.length) {
			System.out.println("loop "+arr[i]);
			i++;
		}
		
		
		String[] str = new String[5];
		str[0] = "string";
		str[2] = "syed";
		System.out.println(str);
		
		String[] s = {"first","second","third","four"};
		System.out.println(s.length);
	}
}
