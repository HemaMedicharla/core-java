package SetGetMethods;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj1=new Book();
		Book obj2=new Book();
		obj1.setBookId(1002);
		obj1.setTitle("Harry Potter");
		obj1.setAuthor("J.K. Rowling");
		obj1.setPrice(250.7);
		System.out.println(obj1.getBookData());
		System.out.println(" ----------------------");
		obj2.setBookId(1563);
		obj2.setTitle("To Kill a Mockingbird");
		obj2.setAuthor("Harper Lee");
		obj2.setPrice(250.7);
		System.out.println(obj2.getBookData());

	}

}
