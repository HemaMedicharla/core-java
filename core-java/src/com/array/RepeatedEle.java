package com.array;

public class RepeatedEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,3,4,4,4,5,5,6};
		int maxcount=0;
		int val=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				val=arr[i];
				
			}
		}
		System.out.println(val);
	}

}
