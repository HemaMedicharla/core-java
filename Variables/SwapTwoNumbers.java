//4.Swap Two Numbers:- Swap using third variable.- Swap again without third variable.
package Variables;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Before Swapping the variables:"+"a :"+a+" "+"b :"+b);//two variables
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping the variables:"+"a :"+a+" "+"b :"+b);//without third variable
		a=10;
		b=20;
		System.out.println("Before Swapping the variables:"+"a :"+a+" "+"b :"+b);//assigning two variables
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping the variables:"+"a :"+a+" "+"b :"+b+" "+"c :"+c);//third variable
		

	}

}
