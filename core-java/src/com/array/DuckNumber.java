package ProblemSolving;

public class DuckNumber {
	public int num=0205;
	public void checkNumber() {
	int digit=0;
	boolean Ducknumber=false;
    while(num!=0) {
			digit=num%10;
			if(digit==0) {
				Ducknumber=true;
				
			}
			num=num/10;
			
		}
    System.out.println(Ducknumber?"Duck":"!Duck");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckNumber obj=new DuckNumber();
		obj.checkNumber();


	}

}
//duck number
//the number which as zero in between or at the end like 1098,1230,230567
//not duck number is 012,5,121