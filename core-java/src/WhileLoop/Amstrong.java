package WhileLoop;

public class Amstrong {
	public int getPower(int base , int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
		}
		return power;
	}
	public int getCount(int num) {
		int count=0;
		while(num!=0) {
			count ++;
			num/=10;
		}
		return count;
	}
	public boolean amStrong(int num) {
		int count=getCount(num);
		int temp=num;
		int sum=0;
		while(num!=0) {
			int base=num%10;
			sum=sum+getPower(base,count);
			num/=10;
		}
		return temp==sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amstrong obj=new Amstrong();
		System.out.println(obj.amStrong(153)?"Amstrong":"!Amstrong");

	}

}
