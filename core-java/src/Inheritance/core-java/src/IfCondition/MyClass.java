package IfCondition;

public class MyClass {
	 public boolean isEven(int num) {
	
		if (num % 2 == 0) {  
	        
	        return true;   
	    }
		return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyClass obj = new MyClass(); 
		 System.out.println("Is 10 even? " + obj.isEven(10));
		 

	}

}
