package com.hexaware.finalProjectDemo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.finalProjectDemo2.config.Configure;
import com.hexaware.finalProjectDemo2.entity.workExperience;
import com.hexaware.finalProjectDemo2.service.IWorkExp;
import com.hexaware.finalProjectDemo2.service.workExpSerImpl;






/**
 * Hello world!
 *
 */
public class App 
{
	static Scanner sc= new Scanner(System.in);
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
				
				boolean value=w1.insert(createObj());
				if(value)
					System.out.println("insertion succesful");
				else
					System.out.println("insertion failed");
				break;
			}
				
				
				
			
			case 2:
			{
				boolean value=w1.update(createObj());
				if(value)
					System.out.println("update succesful");
				else
					System.out.println("updation failed");
				break;
			}
			case 3:
			{
				boolean value=w1.delete(sc.next());
			if(value)
				System.out.println("delete succesful");
			else
				System.out.println("deletion failed");
			break;
				
				
			}
			case 4:
			{
				System.out.println("enter the id");
				System.out.println(w1.getWorkExperience(sc.next()));
				
				break;
			}
			case 5:
			{
				
				System.out.println(w1.getAllWorkExperiences());
				
				break;
			}
			
			case 6:
			{
				flag=false;
				sc.nextLine();
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

