package com.OOPs;
class Payment{
	double amount;
	int transactionLimit;
	public void processPayment(Double paymentAmount) {
		System.out.println("Payment Processing !");
	}
	
}
class CreditCardPayment extends Payment{
	public  CreditCardPayment(Double credit) {
		this.amount=credit;
	}
	@Override 
	public void processPayment(Double paymentAmount) {
		if(paymentAmount>=amount) {
			System.out.println("Credit Card Payment Sucessfully");
			amount=amount-paymentAmount;
		}else {
			System.out.println("Credit Exceeded payment failed");
		}
	}
	
}
class DebitCardPayment extends Payment{
	public DebitCardPayment(Double balance){
		this.amount=balance;
	}
	@Override
	public void processPayment(Double paymentAmount) {
		if(paymentAmount>=amount) {
			System.out.println("Debit Card Payment Sucessfully");
			amount=amount-paymentAmount;
		}else {
			System.out.println("Insufficient Balance payment failed");
		}
	}
	
}
class UPIPayment extends Payment{
	 public UPIPayment(Integer dailyLimit) {
	        this.transactionLimit = dailyLimit;
	    }

	    @Override
	   public void processPayment(Double paymentAmount) {
	        if (paymentAmount <= transactionLimit) {
	            System.out.println("UPI Payment Successful");
	            transactionLimit = transactionLimit - paymentAmount.intValue(); 
	        } else {
	            System.out.println("UPI Daily Limit Exceeded - Payment Failed");
	        }
	    }
	
}

public class OnlinePaymentSyatem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Payment payment;
		 payment = new CreditCardPayment(50000.0);
	        payment.processPayment(10000.0);

	        payment = new DebitCardPayment(20000.0);
	        payment.processPayment(15000.0);

	        payment = new UPIPayment(5000);
	        payment.processPayment(3000.0);
	    }
	}
