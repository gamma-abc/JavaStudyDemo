package com.D13.StringBuffer;

public class MaoPaoPaiXu {
	public static void MinToMaxArray(int [] arr) {
		//int max=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
