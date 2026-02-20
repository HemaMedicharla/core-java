package com.array;

import java.util.Scanner;

public class ExistsOfArray {

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

	        System.out.println("Enter the element to search:");
	        int key = sc.nextInt();

	        boolean found = false;

	        for(int i = 0; i < n; i++) {
	            if(arr[i] == key) {
	                found = true;
	                break;   // Stop searching once found
	            }
	        }

	        if(found) {
	            System.out.println("Element found in the array.");
	        } else {
	            System.out.println("Element not found in the array.");
	        }

	        sc.close();

	}

}
