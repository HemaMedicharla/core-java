package WhileLoop;

public class UglyNumber {
	public static boolean isUgly(int num) {//25
		if(num<=0) {//t
			return false;
		}
		while(num!=0) {//t
			if(num%2==0) {//t
				num/=2;//15
			}else if(num%3==0) {//t
				num/=3;//5
			}else if(num%5==0) {//t
				num/=5;//1
			}else {
				break;
			}
		}
		return num==1;//1==1
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUgly(25)?"Ugly NUMBER":"!NOT A UGLY NUMBER");

	}

}
