package SetGetMethods;

public class Book {
	int bookId;
	String title;
	String author;
	double price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int id) {
		bookId = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String t1) {
		title = t1;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String a1) {
		author = a1;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double p1) {
		price = p1;
	}
	public String getBookData() {
		return " Book Id:"+bookId+"\n Book Title:"+title+"\n Book Author:"+author+"\n Book Price:"+price;
	}
	

}
