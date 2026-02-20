package com.array;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of elements :");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 System.out.println("Enter"+n+"Elemnets");
		 for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Array elements in reverse order:");

	        for(int i = n - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }

	        sc.close();

	}

}
