package com.hexaware.string;

public class StudentImpl {
	

	public static void main(String[] args) {
//		String s1=new String("sasidhar");
//		String s2=new String("sasidhar");
//		System.out.println(s1.equals(s2));
//		String s3="mahidhar";
//		String s4="mahidhar";
//		System.out.println(s3.equals(s4));
		StringBuffer sb1=new StringBuffer("mahidhar");
		sb1.append(" mahidhar");
		System.out.println(sb1);
		
		String s1=new String("hello");
		String s2=new String("word");
		System.out.println(s1.compareTo(s2));
		
		int i1=55;
		int i2=55;
		System.out.println(i1==i2);
	}

}
