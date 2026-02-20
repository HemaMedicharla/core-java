package IfCondition;

public class Example3 {
	public int findGreater(int num1, int num2) {
		if(num1>num2) 
			return num1;
		
		if(num2>num1) 
			return num2;
		
		return num1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 obj=new Example3();
		 System.out.println("Greater number (10, 25): " + obj.findGreater(10, 25));

	}

}
