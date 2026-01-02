package ProblemSolving;

public class AutomarphicNumber {
	public int num=10;
	public void checkNumber() {
		int squ=num*num;
		int temp=num;
		int rem;
		boolean automarphicnum=false;
		while(num!=0) {
			rem=squ%10;
			temp=num%10;
			if(rem==temp) {
				automarphicnum=true;
			}
			num=num/10;
			temp=temp/10;
		}
		System.out.println(automarphicnum?"AutomarphicNumber":"!AutomarphicNumber");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomarphicNumber obj=new AutomarphicNumber();
		obj.checkNumber();

	}

}

//Automorphic Number
//An Automorphic Number is a number whose square ends with the same digits as the number itself.
//like 5->5*5=25,6->6*6=36,10->10*10=100
//un-like 4->4*4=16,7->7*7=49