//inheritance

package ProblemSolving;
class Computer{
	public void showBrand() {
		System.out.println("Brand : Dell");
	}
}

public class Laptop extends Computer{
	public void showModel() {
		System.out.println("Model : XPS 15");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l=new Laptop();
		l.showBrand();
		l.showModel();

	}

}
