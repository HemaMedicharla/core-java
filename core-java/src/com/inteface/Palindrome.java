package com.inteface;

public class Palindrome {
	public static boolean isPalindrome(int num) {
		int temp=num;
		int rev =0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev==temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=UtilityArray.getArray();
		for(int ele:arr) {
			if(isPalindrome(ele)) {
				System.out.println(ele);
			}
		}

	}

}
