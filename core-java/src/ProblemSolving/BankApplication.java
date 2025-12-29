package ProblemSolving;

import java.util.Scanner;

public class BankApplication {
	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;
	//constuctor
	
	public BankApplication(String customerName, String customerAddress, long phoneNumber, double balance) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		System.out.println("Account Created Successfully ");
	}
	//getter setter
	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	
	public void deposit(double amount) {
		if(amount<=0) {
			System.out.println("Invalid Amount");
		}else{
			this.balance +=amount;
			System.out.println("Updated balance :"+this.balance);
		}
	}
	
    
	public void withdraw(double amount) {
    	if(amount<=0) {
    		System.out.println("Invalid Amount");
    	}else if(amount > this.balance) {
    		System.out.println("Insufficient funds");
    	}else {
    		this.balance -=amount;
    		System.out.println("Withdraw Successfully :"+this.balance);
    	}
		
	}
    public void showBalance() {
    	System.out.println("Current Balance :"+this.balance);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
		String customerName=sc.nextLine();
		System.out.println("Enter Address :");
		String customerAddress=sc.nextLine();
		System.out.println("Enter PhoneNumber :");
		long phoneNumber=sc.nextLong();
		System.out.println("Enter Initial deposit amount :");
		double balance=sc.nextDouble();
		
		BankApplication app=new BankApplication(customerName, customerAddress, phoneNumber, balance);
		System.out.println("**** Select an Option from Below **** \r\n" + 
				"1. Withdraw \r\n" + 
				"2. Deposit \r\n" + 
				"3. Show Balance \r\n" + 
				"4. Exit \r\n" + 
				"Enter your option [1-4]: ");
		
		boolean status=true;
		while(status) {
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter withdraw amount :");
				double amount =sc.nextDouble();
				app.withdraw(amount);
				break;
			}
			case 2:{
				System.out.println("Enter Deposit Amount :");
				double amount =sc.nextDouble();
				app.deposit(amount);
				break;
			}
			case 3:{
				app.showBalance();
				break;
			}
			case 4:{
				System.out.println("THANK YOU !");
				status=false;
			}
			}
		}
		sc.close();

	}
	

}
