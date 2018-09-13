package com.D13.StringBuffer;

public class FindArray {
	public static int FindValue(int[] arr, int value) {
		/*
		 * 功能：二分法查找元素 参数1 要查找的数组，参数2 要查找的元素 返回值 返回要查找的索引，如果不存在返回-1
		 */
		int max = arr.length - 1;
		int min = 0;
		int mid = (min + max) / 2;
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = max + 1;
				
				if (min>max) {
					return -1;
				}
			}mid = (max - min) / 2;
		}
		return mid;
	}
}
