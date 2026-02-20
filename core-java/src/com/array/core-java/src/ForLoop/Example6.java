package ForLoop;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(int i=20;i>=1;i--) {
		//	if(i%3==0 && i%5==0) {
				//System.out.println(i); 
			//}
		//}
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
