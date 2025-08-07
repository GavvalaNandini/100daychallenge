package com.palle;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {50,25,5,10,20};
		Bubblesort(arr);
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}


 static void Bubblesort(int[]arr) {
	 int n=arr.length;
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<n-i-1;j++) {
			 if(arr[j]>arr[j+1]) {
				 int temp=arr[j+1];
				 arr[j+1]=arr[j];
				 arr[j]=temp;
				 
			 }
		 }
	 }
 }
 }
	

