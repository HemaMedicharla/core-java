package Consturctor;

public class Book {
	private int bookId;
	private String title;
	private int availableCopies;
	//creating the parameterized constructor
	//this is a keyword rfers to current object
	public Book(int bookId,String title,int availableCopies ) {
		this.bookId=bookId;
		this.title=title;
		this.availableCopies=availableCopies;
	}
	//getter methods
	public int getBookId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	//instance method
	public boolean borrowBook() {
		if(availableCopies>0) {
			availableCopies--;
			return true;
		}else {
			return false;
		}
		
	}
	public void  returnBook() {
		availableCopies++;
	}

}
