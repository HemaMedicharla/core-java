package test;

class InsurancePolicy {
	private String CustomerNmae;
	private String PolicyType;
	private double PolicyAmount;
	private double ApprovedAmount;
	private String PolicyStatus;
	
	public InsurancePolicy(String customerNmae, String policyType) {
		
		this.CustomerNmae = customerNmae;
		this.PolicyType = policyType;
		
	}
    public InsurancePolicy(String customerNmae, String policyType, double policyAmount) {
		
		this.CustomerNmae = customerNmae;
		this.PolicyType = policyType;
		this.PolicyAmount = policyAmount;
		
	}
   public InsurancePolicy(String customerNmae, String policyType, double policyAmount, double approvedAmount,String policyStatus) {
	
	this.CustomerNmae = customerNmae;
	this.PolicyType = policyType;
	this.PolicyAmount = policyAmount;
	this.ApprovedAmount = approvedAmount;
	this.PolicyStatus = policyStatus;
	System.out.println("policy record has been created");
    }
	public void UpdateApprovedAmount(double amount) {
		if(amount==0 ||amount<=0) {
			System.out.println("Invalid Details");
		}else {
			ApprovedAmount=amount;
		}
		
	}
	public void changePolicyStatus(String status) {
		if(status==null || status.equals("")) {
			System.out.println("Invalid Details");
		}else {
			
		}
		
	}
	public void viewPolicySummary() {
		System.out.println("Customer :"+CustomerNmae);
		System.out.println("Policy type :"+PolicyType);
		System.out.println("Policy Amount :"+PolicyAmount);
		System.out.println("Approved Amount :"+ApprovedAmount);
		System.out.println("Policy Status :"+PolicyStatus);
	}
	
}


public class InsuranceCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
