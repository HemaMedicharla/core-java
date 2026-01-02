package Inheritance;

public class Child extends Parent{
	public void diplayChild() {
		System.out.println("this is a child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
////		----Child refvar=new Child();-------
//		Child c=new Child();
//		c.displayParent();
//		c.diplayChild();
		
//       	----Parent p=new Parent();-------
//		Parent p=new Parent();
//		p.displayParent();
		
        /*-----Parent p=new Child();--------*/
//		Parent p=new Child();
//		p.displayParent();
		
		/*-----Child c=new Parent();--------*/
		Parent p=new Child();
		Child c=(Child)p;
		c.diplayChild();
		c.displayParent();
		
		
	}

}
