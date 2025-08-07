package com.palle;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {100,99,75,65,84};
		Insertionsort(arr);
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}


static void Insertionsort(int[]arr){
	int n=arr.length;
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j>0;j--) {
		if(arr[j]<arr[j-1]) {
			int temp=arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=temp;
		}
		}
	}
	
}
}
