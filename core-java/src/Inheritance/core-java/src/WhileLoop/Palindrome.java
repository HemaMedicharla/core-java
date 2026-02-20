package WhileLoop;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221;
		int original=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println( (original==rev)? "Palindrome":"!Pralindrome");
		
	}

}
