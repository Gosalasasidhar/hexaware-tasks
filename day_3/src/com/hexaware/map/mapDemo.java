package com.hexaware.map;

import java.util.Map;
import java.util.TreeMap;

import com.hexaware.set.myComp;

import pojo.Employee;

public class mapDemo {
	public static void main(String[] args)
	{
		Map<Employee,String> m1=new TreeMap<Employee,String>(new myComp());
		m1.put(new Employee(463,"ramesh",50000), "hyderabad");
		m1.put(new Employee(463,"faresh",50000), "hyderabad");
		m1.put(new Employee(463,"sasidhar",50000), "hyderabad");
		m1.put(new Employee(463,"suressh",50000), "chennai");
		System.out.println(m1);
	}

}
