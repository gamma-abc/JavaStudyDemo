package com.D14.regular;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private DateUtil() {
	}

	public static String DateToString (Date d , String format) {
		//SimpleDateFormat sdf=new SimpleDateFormat(format);
		return new SimpleDateFormat(format).format(d);
	}
	/**
	 * ��������ǰ�һ���ַ�������תΪ�ַ�����ʽ
	 * @param s
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Date StringToDate(String s,String format) throws ParseException {
		return  new SimpleDateFormat(format).parse(s);
	}
}
