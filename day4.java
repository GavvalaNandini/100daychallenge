package com.palle;

import java.util.Arrays;

public class day4 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int []arr= {10,40,50,200,700};
//		int big=arr[0];
//		int second=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>big) {
//				second=big;
//				big=arr[i];
//			}
//			else if(second>arr[i]&& arr[i]!=big) {
//				second=arr[i];
//			}
//		}
//		System.out.println(second);
		String s="nandu is software engineer";
		String []s1=s.split(" ");
		System.out.println(Arrays.toString(s1));
		for(int i=s1.length-1;i>=0;i--) {
			String element=s1[i];
			for(int j=element.length()-1;j>=0;j--) {
				System.out.print(element.charAt(j));
				
			}
			System.out.print(" ");
		}
		String s2="nandu memory";
		String[] s3=s2.split("");
		System.out.println(Arrays.toString(s3));
		for(int i=0;i<s3.length;i++) {
			for(int j=i+1;j<s3.length;j++) {
				if(s3[i].equals(s3[j])&&!s3[i].equals("0")) {
					System.out.println(s3[j]);
					s3[j]="0";
					break;
					
				}
			}
		}
//		for(int i=0;i<s3.length;i++) {
//			if(s3[i].equals("0")) {
//				System.out.println(s3.charAt[i]);
//			}
//		}
		
		
		
		
	}

}
