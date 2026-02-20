package Operators;

public class Example5 {

	public static void  validate(int a, int b, int c) {
		boolean  part1= (a > b && b < c);
		boolean part2=  !(a == c);
		boolean result =part1||part2;
		System.out.println(part1);
		System.out.println(part2);
		System.out.println(result);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		validate(5, 9, 15);
	}

}
