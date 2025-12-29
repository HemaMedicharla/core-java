package Operators;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=19;
		boolean ID=true;
		boolean agemorethan18=age>18;
		boolean logicalAnd=agemorethan18 && ID;
		boolean logicalOr=agemorethan18 || ID;
		boolean logicalNOT=!agemorethan18;
		System.out.println("age"+age);
		System.out.println("ID"+ID);
		System.out.println("agemorethan18"+agemorethan18);
		System.out.println("logical AND"+logicalAnd);
		System.out.println("Logical OR"+logicalOr);
		System.out.println("logical NOT"+logicalNOT);
	}

}
