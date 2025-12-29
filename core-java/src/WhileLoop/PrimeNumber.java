package WhileLoop;
public class PrimeNumber {
	public boolean getPrime(int num) {
		
		for(int i=2;i<=num/2;i++) {
	        
			if(num%i==0) {
				return false;	
			}	
		}
		return true;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj=new PrimeNumber();
		System.out.println(obj.getPrime(25)?"Prime":"!Prime");

	}

}
