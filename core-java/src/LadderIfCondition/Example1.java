package LadderIfCondition;

public class Example1 {
	 public String checkLoanApproval(double salary, int creditScore) {
		 if(salary>=80000 && creditScore>=750) {
			 System.out.println("Loan Approved Immediately");
		 }else if((salary>=50000 && salary < 80000 )&&(creditScore>=650 && creditScore<750)) {
			 System.out.println("Loan Approved with Higher Interest Rate");
		 }else if((salary>=30000 && salary<50000)&&(creditScore>500 && creditScore<650)) {
			 System.out.println("Co-signer Required");
		 }
		 else {
			 System.out.println("Loan Rejected");
		 }
		 return "Invalid Laon";
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 obj=new Example1();
		obj.checkLoanApproval(65000,600);

	}

}
