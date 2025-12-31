package Instance;

public class Example1 {
	public static String name="Hema";
	int age=21;
	String gender="Female";
	
	public  void printData() {
		System.out.println("Details :");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+gender);
		
	}

	public static void main(String[] args) {
		
		Example1 obj1=new Example1();
		Example1 obj2=new Example1();
		obj1.printData();
		name="madhu";
		obj1.age=19;
		obj1.printData();
	}

}
