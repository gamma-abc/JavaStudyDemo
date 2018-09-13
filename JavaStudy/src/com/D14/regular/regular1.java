package com.D14.regular;

import java.util.Arrays;

public class regular1 {
	public static String stringsort() {
//		定义一个字符串
		String s="11 22 3 12 44 222";
//		设定正则表达式规则
		String[] str=s.split(" ");
//		定义一个int数组接受字符串
		int [] a=new int[str.length];
		for(int i=0;i<str.length;i++) {
			a[i]=Integer.parseInt(str[i]);
		}
		System.out.println("-----------");
//		用Arrays类进行排序
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
//		将字符串转为StringBuilds类型
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a.length;i++) {
			sb.append(a[i]).append(" ");
		}
//		将StringBuilds类型转为String类型,并去掉末尾空格
		String ss=sb.toString().trim();
		return ss;
	}
}
