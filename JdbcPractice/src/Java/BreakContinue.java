package Java;

public class BreakContinue {
	public static void main(String[] args) {
	
	for(int i=0; i<1000;i++) {
		if(i == 100) {
			break;
		}
		System.out.println(i);
	}

	for(int i=0; i<10;i++) {
		if(i == 5) {
			continue;
		}
		System.out.println(i);
	}
	
	
 }
}
