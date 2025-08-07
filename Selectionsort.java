package com.palle;

public class Selectionsort {
	public static void main(String[]args) {
		int []arr= {20,8,5,10,7};
		Selectionsort(arr);
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}


 static void Selectionsort(int[]arr) {
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		int min=i;
		
		for(int j=i+1;j<n;j++) {
			if(arr[j]<arr[min]) {
				min=j;
				
	
			}
		}
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;;
		
		
	}
	
}
}