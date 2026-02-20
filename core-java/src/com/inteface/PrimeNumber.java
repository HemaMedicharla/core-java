package com.inteface;

public class PrimeNumber {
	public static boolean getPrime(int num) {
		if(num <=1) {
			return false;
		}else {
			for(int i=2;i*i<=num;i++) {
				if(num%i==0) {
					return false;
				}
				
			}
			return true;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=UtilityArray.getArray();
		for(int ele:arr) {
			if(getPrime(ele)) {
				System.out.println(ele);
			}
		}

	}

}
