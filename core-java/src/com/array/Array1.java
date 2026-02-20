package com.array;


import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Size of an Array");
			int size=Integer.parseInt( sc.nextLine());
			if(size<=0 || size>10) {
				System.out.println("Invalid Number");
				sc.close();
			}else {
			String str[]=new String[size];
			for(int i=0;i<size;i++) {
				
					System.out.println("Enter"+i+"Index Value:");
					str[i]=sc.nextLine();
				}
			    sc.close();
				System.out.println("array is:"+Arrays.toString(str));
			}
			

}
}
