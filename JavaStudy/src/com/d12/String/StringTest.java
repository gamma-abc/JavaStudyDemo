package com.d12.String;
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ͳ��MaxString�ַ�����MinString���ֵĴ���
		 */
		String MaxString = "woaijavawozhendeaijavawoshizhendeaijava"; //����
		String MinString = "java";
		int cout = StringFindString.getCount(MaxString,MinString);
		System.out.println(MinString + "������" + cout + "��");
	}

}
