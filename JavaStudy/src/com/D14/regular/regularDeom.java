package com.D14.regular;

import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularDeom {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String s1 = regular1.stringsort();
		System.out.println(s1);
		String s2 = "aaab";
		String regex = "a*b";
		boolean a = s2.matches(regex);
		System.out.println(a);
		System.out.println("-------------");
		DateDemo.show();
		System.out.println("-------------");
		Date d = new Date();
		String format = "yyyy"; 
		String s3 = DateUtil.DateToString(d, format);
		System.out.println(s3);
		System.out.println("-------------");
//		获取当前的年
		Calendar nCalendar = Calendar.getInstance();
		int year = nCalendar.get(Calendar.YEAR);
		System.out.println("今年：" + year);
//		输入年份，输出二月的天数
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入年份：");
		int getYear=sc.nextInt();
		Calendar c2=Calendar.getInstance();
		c2.set(getYear, 2, 1);
		c2.add(Calendar.DATE, -1);
		System.out.println("二月有"+c2.get(Calendar.DATE)+"天");
	}

}
