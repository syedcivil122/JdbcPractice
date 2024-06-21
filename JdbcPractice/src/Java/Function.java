package Java;

public class Function {
	
	public static void printfirstPattern() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	
	public static void printsecondPattern() {
		System.out.println();
		System.out.println("* * * * *");
		System.out.println("* * * *");
		System.out.println("* * *");
		System.out.println("* * ");
		System.out.println("*");
		
	}
	
	
	public static void printthirdpattern() {
//		System.out.println("        *");
//		System.out.println("      * *");
//		System.out.println("    * * *");
//		System.out.println("  * * * *");
//		System.out.println("* * * * *");
		
	    int rows =0;
	    while(rows<5) {
	    	System.out.print("*");
	    	int i=0;
	    	while(i<rows) {
	    		System.out.print(" *");
	    		i++;
	    	}System.out.println();
	    	rows++;
	    }
	}
	public static void main(String[] args) {
		
//		System.out.println("in main method");
//		greatUser();
//		System.out.println("Mrthod calling complete");
//		greatUser();
		
//		printfirstPattern();
		printthirdpattern();
//		printsecondPattern();
		
		
		
	}
		public static void greatUser() {
			System.out.println("Good Morning KG Coding ");
			
		
	}
}
