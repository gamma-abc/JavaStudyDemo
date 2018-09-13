package com.D15ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add("hello");
		list.add("world");
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
