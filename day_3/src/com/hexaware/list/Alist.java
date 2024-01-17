package com.hexaware.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//array list is used for easy retrival due to easy implementation of interfaces
public class Alist {
	//ArrayLisT iMPLEMENTATION

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(101);
		l1.add(22);
		l1.add(-333);
		l1.add(-44);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		System.out.println((Integer)l1.get(1)+(Integer)l1.get(2));//convert from object to integer
		int sum =0;
		for(Object a1:l1)
		{
			int a=(Integer)a1;
			System.out.println(a);
		}
		System.out.println(sum);
		Collections.sort(l1);
		System.out.println(l1);
		
	}	

}
