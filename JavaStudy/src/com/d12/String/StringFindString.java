package com.d12.String;

public class StringFindString {
	public static int getCount(String MaxString, String MinString ) {
		/*
		 * ����һ��index����MaxString��һ�η��ص�ֵ��
		 * ֵΪ-1��˵���Ҳ���MinString
		 */
		int index=0;
//		ͳ��MinString���ֵĴ���
		int cont=0;
		index=MaxString.indexOf(MinString);
//		�ж�index�Ƿ�Ϊ-1����-1��δ���ҵ�
		while(index!=-1) {
//			ÿ�ҵ�һ�����ϵ�cont+1
			cont++;
//			��ȡMaxString����ֵ+MinString�ĳ��Ⱥ�����ַ����¸�ֵ��MaxString
			MaxString = MaxString.substring(index+MinString.length());
//			�ٽ��в���һ�Σ�ֱ��index=-1
			index = MaxString.indexOf(MinString);
		}
		System.out.println(cont);
		
		return cont;
	}
}
