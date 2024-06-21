package ClassesAndObjects;

public class Book {

	static int totalNoOfBooks;  // static variable
	// instance variables
	String title;
	String author;
	String isbin;
	boolean isborrowed;
	
	static {
		    totalNoOfBooks = 0;
	}
	
	{  // Object init
		totalNoOfBooks++;
	}
	
	Book(String isbin,String title, String author){ //constructor
		this.author = author;
		this.isbin = isbin;
		this.title = title;
	}
	
	Book(String isbin){
		
	}
	
    static int getTotalBooks() { // static method
		return totalNoOfBooks;
	}	
    
	public void borrowBooks() { // instance method
		if(isborrowed) {
			System.out.println("Book is already borrowed");
		}else {
			this.isborrowed = true;
			System.out.println("Enjoy the Book");
		}
		
	}
	
	void returnBook() { // inreturn method
		if(isborrowed) {
			this.isborrowed = false;
			System.out.println("Hope you Enjoyes, please leave a review");
		}else {
			System.out.println("This book is already in library");
		}
		
		
	}
public static void main(String[] args) {
	Book asign = new Book("1", "design", "Author");
	Book myBook = new Book("2");
	System.out.println(Book.getTotalBooks());
	asign.borrowBooks();
	myBook.borrowBooks();
	asign.borrowBooks();
	asign.returnBook();
	
	
}
	
	
	
}
