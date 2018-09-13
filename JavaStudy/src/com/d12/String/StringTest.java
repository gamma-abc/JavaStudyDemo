package com.d12.String;
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 统计MaxString字符串中MinString出现的次数
		 */
		String MaxString = "woaijavawozhendeaijavawoshizhendeaijava"; //三次
		String MinString = "java";
		int cout = StringFindString.getCount(MaxString,MinString);
		System.out.println(MinString + "出现了" + cout + "次");
	}

}
