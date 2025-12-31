package Operators;

public class Example1 {
	
	public static void calculate() {
		int x=5;
		int y=3;
		System.out.println("Addition :"+(x+y));
		System.out.println("subtraction :"+(x-y));
		System.out.println("multiplication :"+(x*y));
		System.out.println("division :"+(x/y));
		System.out.println("modulus :"+(x%y));
		++x;
		y++;
		System.out.println("------- After Pre-Increment and Post-Increment----------" );
		System.out.println("Addition :"+(x+y));
		System.out.println("subtraction :"+(x-y));
		System.out.println("multiplication :"+(x*y));
		System.out.println("division :"+(x/y));
		System.out.println("modulus :"+(x%y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate();
		

	}

}
