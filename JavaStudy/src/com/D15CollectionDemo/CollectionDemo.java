package com.D15CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection c1 = new ArrayList<>();
		c1.add("hello");
		c1.add("world");
		System.out.println(c1);
		Object[] obj = c1.toArray();
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
			String s = (String) obj[i];
			System.out.println(s + s.length());
		}
//		����ѧ����
		Student s1 = new Student("������", 25);
		Student s2 = new Student("�����", 24);
		Collection c2 = new ArrayList();
//		���Ԫ��
		c2.add(s1);
		c2.add(s2);
//		����תΪ��������
//		Object[] obj2 = c2.toArray();
////		��������
//		for (int i = 0; i < obj2.length; i++) {
////			����ת��
//			Student s3 = (Student) obj2[i];
//			System.out.println(s3.getName() + "----" + s3.getAge());
//		}
		System.out.println("Iterator�ӿڵ�ʹ�ã����ڱ�������");
		Iterator it=c2.iterator();
//		����1���������
		while(it.hasNext()) {
			Student s=(Student) it.next();
			System.out.println(s.getName()+s.getAge());
		}
		System.out.println("-------for---------");
//		����2��Ч�ʸߣ���ΪIt����ֱ������
		for(Iterator It = c2.iterator();it.hasNext();) {
			Student ss=(Student)it.next();
			System.out.println(ss.getName()+ss.getAge());
		}
	}
}
