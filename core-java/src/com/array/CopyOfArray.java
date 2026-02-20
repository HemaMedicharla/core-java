package com.array;

import java.util.Scanner;

public class CopyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of elements :");
		 int n=sc.nextInt();
		 int arr1[]=new int[n];
		 int arr2[]=new int[n];
		 System.out.println("Enter"+n+"Elemnets");
		 for(int i = 0; i < n; i++) {
	            arr1[i] = sc.nextInt();
	        }

	        // Copying elements
	        for(int i = 0; i < n; i++) {
	            arr2[i] = arr1[i];
	        }

	        System.out.println("Elements of the second array:");

	        for(int i = 0; i < n; i++) {
	            System.out.print(arr2[i] + " ");
	        }

	        sc.close();

	}

}
