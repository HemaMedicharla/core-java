//6. Type Casting:- Convert double → int.- Convert int → double.- Convert char → int.

package Variables;

public class ConvertingDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=2.25;
		int i=(int) d;
		System.out.println("Converting double → int: "+i);//double->int
		
		int i1=20;
		double d1=i1;
		System.out.println("Converting int → double: "+d1);//int->double
		
		char ch='A';
		int i2=ch;
		System.out.println("Converting char → int: "+i2);//char->int

	}

}
