package com.D13.StringBuffer;

public class StringBufferDemo {
	public static void main(String[] args) {
//		StringBuffer sB = new StringBuffer();
//		System.out.println(sB.length());
//		StringBuffer sB2=new StringBuffer("hello");
//		System.out.println(sB2.capacity());

		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello");
		System.out.println(sb1);
		System.out.println("---------------------");
		int[] arr = { 1, 55, 4, 98, 1, 47, 55 };
		String string = arrToString(arr);
		System.out.println(string);
		System.out.println("------------------");
		String s1 = "hello";
		String s2 = "world";
		System.out.println("before String s1=" + s1 + " " + "s2=" + s2);
		change(s1, s2);
		System.out.println("after  String s1=" + s1 + " " + "s2=" + s2);
		StringBuffer sb2 = new StringBuffer("hello");
		StringBuffer sb3 = new StringBuffer("world");
		System.out.println("before sb2=" + sb2 + " " + "sb3=" + sb3);
		changeBuffer(sb2, sb3);
		System.out.println("after  sb2=" + sb2 + " " + "sb3=" + sb3);
		/*
		 * 冒泡排序
		 */
		int[] arry = { 2, 4, 9, 3, 8, 1, 7, 5, 6 };
		for (int i = 0; i < arry.length; i++) {
			System.out.print(" a" + i + "=" + arry[i]);
		}
		System.out.println();
		MaoPaoPaiXu.MinToMaxArray(arry);
		for (int i = 0; i < arry.length; i++) {
			System.out.print(" a" + i + "=" + arry[i]);
		}
		System.out.println("--------------------------------------------");
		/*
		 * 选择排序
		 */
		int[] arry1 = { 2, 4, 9, 3, 8, 1, 7, 5, 6 };
		XuanZePaiXu.PaiXu(arry1);
		for (int x : arry1) {
			System.out.print(x + " ");
		}
		System.out.println();
		/*
		 * 二分查找
		 */
		int[] arry2 = { 11, 22, 33, 44, 55, 66, 77, 88 };
		int index = FindArray.FindValue(arry2, 221);
		System.out.println("index=" + index);

		/*
		 * integer对象
		 * Int转成String
		 */
		String s = "100";
//		Integer in = new Integer(s);
		int i=Integer.parseInt(s);
		System.out.println("Integer=" + i);

	}

	public static void changeBuffer(StringBuffer sb1, StringBuffer sb2) {
		// TODO Auto-generated method stub
		sb1 = sb2;
		sb2 = sb2.append(sb1);
	}

	public static void change(String s1, String s2) {
		// TODO Auto-generated method stub
		s1 = s2;
		s2 = s1 + s2;

	}

	/*
	 * 功能：实现输入一个数组，输出[x1,x2,x3...]格式
	 */
	public static String arrToString(int arr[]) {
		StringBuffer s = new StringBuffer();
		s.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				s.append(arr[i]);
				s.append(",");
			} else {
				s.append(arr[i]);
			}
		}
		s.append("]");
		return s.toString();
	}
}
