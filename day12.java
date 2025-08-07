package com.palle;

public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {50,30,10,80,20,90,70};
		quicksort(arr, 0, arr.length-1);
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}

	public static void quicksort(int[]arr,int left,int right) {
		if(left<right) {
	
		int pi=partition( arr,left,right);
		quicksort(arr,left,pi-1);
		quicksort(arr,pi+1,right);
		
	}
	}

 static int  partition(int[] arr,int left,int right) {
	int pivot=arr[left];
	int i=left+1;
	int j=right;
	while(i<=j) {
		if(arr[i]<=pivot) {
			i++;
		}
		else if(arr[j]>pivot) {
			j--;
		}
		else {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	int temp=arr[left];
	arr[left]=arr[j];
	arr[j]=temp;
	return j;
	
	
}
}
