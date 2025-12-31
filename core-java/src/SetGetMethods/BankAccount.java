package SetGetMethods;

public class BankAccount {

	long accountNumber;
	String accountHolderName;
	double Balance;
	public long getAccNumber() {
		return accountNumber;
	}
	public void setAccNumber(long number) {
		accountNumber = number;
	}
	public String getAccHolder() {
		return accountHolderName;
	}
	public void setAccHolder(String holder) {
		accountHolderName = holder;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	public String getBankAccountData() {
		return " Account Number:"+accountNumber+"\n Account Holder:"+accountHolderName+"\n Account Balance:"+Balance;
	}
	
	

}
