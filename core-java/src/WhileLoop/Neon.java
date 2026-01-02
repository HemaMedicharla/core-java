package WhileLoop;

public class Neon {
	public boolean getNeon(int num) {
		int square=num*num;
		int sum=0;
		while(square!=0) {
		int rem=square%10;
		sum=sum+rem;
		square/=10;
		
		}
		return num==sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Neon obj=new Neon();
		System.out.println(obj.getNeon(9)?"Neon":"!Neon");

	}

}
