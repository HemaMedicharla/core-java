package Variables;

public class Variables {
	public static int a=25;//static variable inside the class outside the main method
	int b=34;//non-static variable inside the class outside the main method
	
	public void printData() {
		int c=20;//declare inside the methods,blocks & assign value by developer
		System.out.println("local variable :"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables v=new Variables();
		System.out.println("static variable :"+a);
		System.out.println("non-static variable :"+v.b);
		v.printData();
		

	}

}
