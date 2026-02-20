package com.array;

import java.util.Scanner;

public class CountOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of elements :");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("Enter"+n+"Elemnets");
		 int evenCount = 0;
	     int oddCount = 0;
		 for(int i=0;i<n;i++) {
			 arr[i] = sc.nextInt();

	            if(arr[i] % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        System.out.println("Number of even elements = " + evenCount);
	        System.out.println("Number of odd elements = " + oddCount);

	        sc.close();
			 
		 }

	}


