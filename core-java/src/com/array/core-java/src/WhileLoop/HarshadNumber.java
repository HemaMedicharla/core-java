package WhileLoop;

public class HarshadNumber {
	public static boolean isHarshad(int num) {//18
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;//8   //1
			sum=sum+rem;//(0+8->8)//(8+1->9)
			num=num/=10;//1  //0
		}
		if(temp%sum==0) {//18%9==0
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(isHarshad(18)?"HarshadNumber":"!NOT A HarshadNumber");
	}

}
