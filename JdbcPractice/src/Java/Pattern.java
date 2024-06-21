package Java;

public class Pattern {
	
	public void rightHalfPattern() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	
	public void rightHalfUpPattern() {
		System.out.println();
		System.out.println("* * * * *");
		System.out.println("* * * *");
		System.out.println("* * *");
		System.out.println("* * ");
		System.out.println("*");
		
	}
	
	
	public void leftHalfPattern() {
		System.out.println("        *");
		System.out.println("      * *");
		System.out.println("    * * *");
		System.out.println("  * * * *");
		System.out.println("* * * * *");
	}
	
	
	public static void main(String[] args) {
		Pattern p = new Pattern();
		p.rightHalfPattern();
		p.rightHalfUpPattern();
		p.leftHalfPattern();
		
		
	}
	

}
