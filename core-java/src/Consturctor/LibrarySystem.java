package Consturctor;

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj= new Book(101,"harry potter",2);
		System.out.println("Book Details:");
		System.out.println("Book ID: "+ obj.getBookId());
		System.out.println("Title: "+ obj.getTitle());
		System.out.println("Available Copies: "+ obj.getAvailableCopies());
		for(int i=0;i<=5;i++) {
			if(i<=3) {
				System.out.println("Attempting to borrow a book...");
			if(obj.borrowBook()) {
				System.out.println("Book borrowed successfully! Updated Available Copies: "+obj.getAvailableCopies());
			}else {
				System.out.println("Book is not available for borrowing.");
			}
		}else {
			System.out.println("Attempting to return a book...");
			obj.returnBook();
			System.out.println(" \"Book returned successfully! Updated Available Copies: "+ obj.getAvailableCopies());
		}

	}
	 System.out.println("Library system transactions completed.");

}
}
