package com.D13.StringBuffer;

public class XuanZePaiXu {
	public static void PaiXu(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[y] < arr[x]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}

			}
		}
	}
}
