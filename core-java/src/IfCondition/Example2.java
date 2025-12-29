package IfCondition;

public class Example2 {
	 public boolean canVote(int age) {
		 if(age>=18) 
			return true;
		 
		 return false;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 obj=new Example2();
		 System.out.println("Can vote (Age 20)? " + obj.canVote(20));

	}

}
