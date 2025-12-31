package Operators;



public class CounterDemo {
	int count;
	public void updateAndPrint() {
		System.out.println(count++);
		System.out.println(count);
		System.out.println(++count);
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterDemo obj=new CounterDemo();
		obj.count=5;
		obj.updateAndPrint();

	}

}
