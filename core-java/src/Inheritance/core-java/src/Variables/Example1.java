package Variables;

public class Example1 {
	String empName="madhu";
	int empid=89;
	double empsalary=909090;
	
	public  void printdata(String empName,int empid ,double empsalary) {
		 
		System.out.println(this.hashCode());
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj =new Example1();
		obj.empName="hema";
		obj.empid=90;
		obj.empsalary=89099;
		obj.hashCode();

	}

}
