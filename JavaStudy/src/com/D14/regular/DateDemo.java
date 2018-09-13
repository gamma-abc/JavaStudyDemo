package com.D14.regular;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void show() throws ParseException {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String sd=sdf.format(d);
		System.out.println(sd);
		String ssString="2018-09-12 09:55:56";
		SimpleDateFormat 
		sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date dd=sdf2.parse(ssString);
		System.out.println(dd);
	}
}
