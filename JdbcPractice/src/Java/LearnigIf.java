package Java;

public class LearnigIf {
 public static void main(String[] args) {
	
	 boolean isMale =false;
	 String name = "Bob";
	 
	 System.out.println("before if");
	 if(isMale) {
		 System.out.println("Mr."+name);
	 } else {
			 System.out.println("Ms."+name);
		 }
	 System.out.println("after if");
	 
	 
	 boolean isCitizenship = false;
	 boolean isAdult = false;
	 
	 if(isCitizenship) {
		 System.out.println("Hello senior citizen ");
	 }else {
		 if(isAdult){
			 System.out.println("Hello Adult");
		 }else {
			 System.out.println("Hello child");
		 }
	 }
	 
	 boolean isTeacher = false;
	 boolean isStudent = false;
	 
	 if(isTeacher) {
		 System.out.println("Hello Teacher");
	 }else if(isStudent) {
		 System.out.println("Hello Student");
	 }else {
		 System.out.println("Hello Child");
	 }
}
}
