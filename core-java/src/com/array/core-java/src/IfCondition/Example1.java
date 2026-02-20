package IfCondition;

public class Example1 {
	public String checkNumber(int num) {
		if(num>0) {
			return "Positive";
		}
		if(num<0) {
			return "Negative";
		}
		return "Zero";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj=new Example1();
		 System.out.println("Check -5: " + obj.checkNumber(-5));

	}

}
