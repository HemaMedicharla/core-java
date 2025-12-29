package SetGetMethods;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount obj=new BankAccount();
		obj.setAccNumber(19023556);
		obj.setAccHolder("harish");
		obj.setBalance(5000000.0);
		System.out.println(obj.getBankAccountData());
		System.out.println("After Updating The Balance------------");
		obj.setBalance(6000000.0);
		System.out.println(obj.getBankAccountData());

	}

}
