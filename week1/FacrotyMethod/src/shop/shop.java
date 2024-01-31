package shop;

import java.util.Scanner;

import com.mobile.MobileBrands;

import facatoryObject.Objectfactory;



public class shop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Brand=sc.nextLine();
		try
		{
		MobileBrands newMobile=Objectfactory.showMobile(Brand);
		System.out.println(newMobile.companyName());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
