package com.d12.String;

public class StringFindString {
	public static int getCount(String MaxString, String MinString ) {
		/*
		 * 定义一个index接受MaxString第一次返回的值，
		 * 值为-1则说明找不到MinString
		 */
		int index=0;
//		统计MinString出现的次数
		int cont=0;
		index=MaxString.indexOf(MinString);
//		判断index是否为-1，是-1则未查找到
		while(index!=-1) {
//			每找到一个符合的cont+1
			cont++;
//			截取MaxString索引值+MinString的长度后面的字符重新赋值给MaxString
			MaxString = MaxString.substring(index+MinString.length());
//			再进行查找一次，直到index=-1
			index = MaxString.indexOf(MinString);
		}
		System.out.println(cont);
		
		return cont;
	}
}
