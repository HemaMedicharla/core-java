package IfCondition;

public class Example4 {
	public boolean isDivisibleBy5(int num) {
		if( num%5==0) 
		return true;
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Example4 obj=new Example4();
		 System.out.println("Is 15 divisible by 5? " + obj.isDivisibleBy5(15));

	}

}
