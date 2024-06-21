package ClassesAndObjects;

public class Course {
 
	String courseName;   //declare instance variable
	int enrollments;    // declare instance variable
	static int maxCapacity = 100; // static variable
	
	String[] enrolledStudents ;  // Array String
	
	Course(String courseName){   // Constructor
		this.courseName = courseName;
		this.enrollments = 0;
		this.enrolledStudents = new String[maxCapacity];
	}
	
	
	
	static void setMaxCapacity(int maxCapacity) {  //static method
		Course.maxCapacity = maxCapacity;
		
	}
	
	void enrollStudent(String studentName) {   // instance method
		enrolledStudents[enrollments] = studentName;
		enrollments++;
	}
	
	void unenrollStudent(String studentName) {      // instance method
		System.out.println("Student removed");
		enrollments--;
	}
	
	
	
}
