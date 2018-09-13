package com.D13.StringBuffer;

public class FindArray {
	public static int FindValue(int[] arr, int value) {
		/*
		 * ���ܣ����ַ�����Ԫ�� ����1 Ҫ���ҵ����飬����2 Ҫ���ҵ�Ԫ�� ����ֵ ����Ҫ���ҵ���������������ڷ���-1
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
