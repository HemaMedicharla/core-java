package com.pattern;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			String str="";
			for(int j=1;j<=n;j++) {
				str+="* ";
			}
			System.out.println(str);
		}

	}

}
