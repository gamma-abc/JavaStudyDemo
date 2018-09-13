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
//		创建学生类
		Student s1 = new Student("风清扬", 25);
		Student s2 = new Student("令狐冲", 24);
		Collection c2 = new ArrayList();
//		添加元素
		c2.add(s1);
		c2.add(s2);
//		集合转为对象数组
//		Object[] obj2 = c2.toArray();
////		遍历数组
//		for (int i = 0; i < obj2.length; i++) {
////			向下转型
//			Student s3 = (Student) obj2[i];
//			System.out.println(s3.getName() + "----" + s3.getAge());
//		}
		System.out.println("Iterator接口的使用，用于遍历数组");
		Iterator it=c2.iterator();
//		方法1：容易理解
		while(it.hasNext()) {
			Student s=(Student) it.next();
			System.out.println(s.getName()+s.getAge());
		}
		System.out.println("-------for---------");
//		方法2：效率高，因为It用完直接销毁
		for(Iterator It = c2.iterator();it.hasNext();) {
			Student ss=(Student)it.next();
			System.out.println(ss.getName()+ss.getAge());
		}
	}
}
