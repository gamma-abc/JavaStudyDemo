package com.D14.regular;

import java.util.Arrays;

public class regular1 {
	public static String stringsort() {
//		����һ���ַ���
		String s="11 22 3 12 44 222";
//		�趨������ʽ����
		String[] str=s.split(" ");
//		����һ��int��������ַ���
		int [] a=new int[str.length];
		for(int i=0;i<str.length;i++) {
			a[i]=Integer.parseInt(str[i]);
		}
		System.out.println("-----------");
//		��Arrays���������
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
//		���ַ���תΪStringBuilds����
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a.length;i++) {
			sb.append(a[i]).append(" ");
		}
//		��StringBuilds����תΪString����,��ȥ��ĩβ�ո�
		String ss=sb.toString().trim();
		return ss;
	}
}
