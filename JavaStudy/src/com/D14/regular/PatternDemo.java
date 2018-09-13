package com.D14.regular;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PatternDemo {
	public static void show() throws ParseException {
		System.out.println("在单词中匹配三个单词的字，并打印出该单词单词如下");
		String s3 = "wo zhen de bu chuo,wo shi tian cai";
		System.out.println(s3);
		//String regex1 = "\\b\\w{3}\\b";
//		把规则编译成模式对象
		//PatternDemo p=PatternDemo.compile(regex1);
//		通过模式对象得到匹配对象
		//Matcher m=p.matcher(s3);
//		通过find方法查找满足匹配条件的字串
//		注意：调用group之前必须先调用find方法
		System.out.println("匹配到的三个字符的单词为");
		//while(m.find()) {
		//String fd=m.group();
		//System.out.println(fd);
		//}
//		java.util.Date d=new java.util.Date();
		
		
	}
}
