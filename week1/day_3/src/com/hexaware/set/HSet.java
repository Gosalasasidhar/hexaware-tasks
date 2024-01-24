package com.hexaware.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import pojo.Employee;

public class HSet {
	public static void main(String args[])
	{
		Set<Object> s1=new HashSet<Object>();
		s1.add("mahidhar");
		s1.add("sasidhar");
		s1.add("suseela");
		s1.add(15);
		System.out.println(s1);
		//objects based on hash values
		
		Set<Object> s2=new LinkedHashSet<Object>();
		s2.add("kumar");
		s2.add(15);
		s2.add(false);
		s2.add(55.325);
		System.out.println(s2);
		
		
		Set<Employee> s3=new TreeSet<Employee>(new myComp());
		s3.add(new Employee(469, "uday", 50000));
		s3.add(new Employee(465, "TARUN", 50000));
		s3.add(new Employee(463, "SASIDHAR", 50000));
		s3.add(new Employee(464, "RAJU", 50000));
		s3.add(new Employee(465, "hemanth", 50000));
		System.out.println(s3);
		
		
	}

}
