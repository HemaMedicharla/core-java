package com.inteface;

import java.util.Scanner;

public interface UtilityArray {
	public static int[] getArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size=sc.nextInt();
		if(size<=0 || size>10) {
			return null;
			
		}else {
			int str[]=new int[size];
			for(int i=0;i<size;i++) {
		
				
					System.out.println("Enter"+i+"Index Value:");
					str[i]=sc.nextInt();
				}
			return str;
				
			}
		}
		
		
	}


