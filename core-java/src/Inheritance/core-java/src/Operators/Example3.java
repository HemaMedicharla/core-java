package Operators;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b=3;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		int AND= a&b;
		int OR= a|b;
		int XOR= a^b;
		int leftshift=a<<b;
		int rightshift=a>>b;
		System.out.println("bitwise AND :" +(AND));
		System.out.println("bitwise OR :"+(OR));
		System.out.println("bitwise XOR :"+(XOR));
		System.out.println("bitwise leftshift :"+(leftshift));
		System.out.println("bitwise rightshift :"+(rightshift));
		int result= a&b + a|b +a^b +a<<b +a>>b;
		System.out.println(result);

	}

}
