package WhileLoop;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givennum=12261;
		int num =1221;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
			if(givennum==rev) {
				System.out.println("it is palindrome :"+rev);
			}else {
				System.out.println("not palindrom");
			}
		

	}

}
