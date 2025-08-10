package com.palle;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []arr= {10,20,30,40,50};
//		int x=99;
//		int y=3;
//		int[]newarr=new int[arr.length+1];
//		for(int i=0;i<y;i++) {
//			newarr[i]=arr[i];
//			
//		}
//		newarr[y]=x;
//		for(int i=y;i<arr.length;i++) {
//			newarr[i+1]=arr[i];
//		}
//		for(int num:newarr) {
//			System.out.println(num);
//		}
//	}
//		int []arr= {10,20,30,40,50};
//		int y=2;
//		int[]newarr=new int[arr.length-1];
//		for(int i=0;i<y;i++) {
//			newarr[i]=arr[i];
//			
//		}
//		for(int i=y;i<newarr.length;i++) {
//			newarr[i]=arr[i+1];
//		}
//		for(int num:newarr) {
//			System.out.println(num);
//		}
//	int[]arr= {1,2,3,4,5};
//	int n=arr.length;
//	
//	for(int i=0;i<n-1;i++) {
//		int last=arr[n-1];
//	for(int j=n-1;j>0;j--) {
//		arr[j]=arr[j-1];
//	}
//	arr[0]=last;
//			}
//	for(int num:arr) {
//		System.out.println(num);
//	}
		int[]arr= {0,1,2,3,4};
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int last=arr[0];
		for(int j=0;j<n-1;j++) {
			arr[j]=arr[j+1];
		}
		arr[n-1]=last;
				}
		for(int num:arr) {
			System.out.println(num);
		}
}
}
