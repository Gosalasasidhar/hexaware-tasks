package com.hexaware.finalproject.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.finalproject.demo.config.Configure;
import com.hexaware.finalproject.demo.entity.workExperience;
import com.hexaware.finalproject.demo.exception.MyException;
import com.hexaware.finalproject.demo.service.IWorkExp;
import com.hexaware.finalproject.demo.service.workExpSerImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(Configure.class);
    	IWorkExp w1=context.getBean(workExpSerImpl.class);
    	boolean flag=true;
    	while(flag)
    	{
    		System.out.println("***welcome***");
			System.out.println("1.  INSERT");
			System.out.println("2.  UPDATE");
			System.out.println("3. DELETE BY ID");
			System.out.println("4. GET DETAILS BY ID");
			System.out.println("5. GET ALL EMPLOYEE DETAILS");
			System.out.println("6. EXIT");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				
				
				boolean val=w1.insert(createObj());
				if(val)
					
					System.out.println("succesful");
				else
					System.out.println("unsuccesful");
				
				break;
			}
				
				
				
			
			case 2:
			{
				boolean val=w1.update(createObj());
				if(val)
					System.out.println("succesful");
				else
					System.out.println("unsuccesful");
				
				break;
			}
			case 3:
			{
				System.out.println("enter company name");
				boolean val=w1.delete(sc.next());
				if(val)
					System.out.println("succesful");
				else
					System.out.println("unsuccesful");
				
				break;
			}
			case 4:
			{
				System.out.println("enter the work experience");
				
				List<workExperience> l=w1.getWorkExperience(sc.next());
				if(l!=null)
				{
					Iterator it=l.iterator();
					while(it.hasNext())
					{
						System.out.println(it.next());
					}
				}
				else
				{
					System.out.println("no objects found");
				}
				break;
			}
			case 5:
			{
				
				
				List<workExperience> l=w1.getAllWorkExperiences();
				if(l!=null)
				{
					for(workExperience i:l)
					{
						System.out.println(i);
					}
				}
				else
				{
					System.out.println("no objects found");
				}
				break;
			}
			
			case 6:
			{
				flag=false;
				break;
			}
			default:
			{
				break;
			}
			}
    	}
        
    }

	private static workExperience createObj() {
		workExperience w1=new workExperience();
		System.out.println("enter company name");
		w1.setCompany(sc.next());
		sc.nextLine();
		System.out.println("enter designation");
		w1.setDesignation(sc.next());
		sc.nextLine();
		System.out.println("enter start_date");
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		w1.setStart_date(LocalDate.parse(sc.next(),dt));
		sc.nextLine();
		System.out.println("enter end_date");
		w1.setEnd_date(LocalDate.parse(sc.next(),dt));
		System.out.println("enter salary");
		w1.setSalary(sc.nextDouble());
		
		return w1;
	}
}
