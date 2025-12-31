package Operators;

public class SumProductCheck {
	public static boolean checkSumVsProduct(int a,int b) {
		int sum=a++ + b++;
		int product= (a-1)*(b-1);
		
		return (sum > product) ? true : false;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=5;
		
		 System.out.println(checkSumVsProduct(a, b));
		

	}

}
