package Operators;

public class DifferenceCheck {
	
	public static boolean checkDifference(int x,int y,int z) {
		int result=x - y - z;
		++result;
		return (result >0)? true:false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=4;
		int z=6;
		System.out.println(checkDifference(x,y,z));

	}

}
