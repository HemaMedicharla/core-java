package WhileLoop;

public class SpyNumber {
	public static void isSpy(int num) {
		
		int sum=0;
		int prod=1;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			prod=prod*rem;
			num/=10;
		}if(sum==prod) {
			System.out.println("Spy Number");
		}else {
			System.out.println("Not Spy Number");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isSpy(213);

	}

}
//112=1+1+2=4
//112=1*1*2=4