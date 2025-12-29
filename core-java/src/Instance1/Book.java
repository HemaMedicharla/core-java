package Instance1;

public class Book {
	public String  bookTitle;
	public String  author;
	public int  isbn;
	public void addBookDetails(String title, String authorName, int number) {
        bookTitle = title;
        author = authorName;
        isbn = number;
    }
	public String displayDetails() {
		return "BookTitle :"+bookTitle+", author :"+author+", BookNumber :"+isbn;
	}

	public static void main(String[] args) {
		Book b1=new Book();
		b1.addBookDetails("To Kill a Mockingbird"," Harper Lee",  123456);
		System.out.println(b1.displayDetails());
		// TODO Auto-generated method stub

	}

}
