package ui;

import java.util.List;
import java.util.Scanner;

import dao.Deptdaoimpl;
import dao.Ideptdao;
import entity.dept;

public class customer {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ideptdao d1=new Deptdaoimpl();
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
			
			int value=sc.nextInt();
			
			switch(value)
			{
			case 1:
			{
				dept d=getValues();
				int c=d1.insert(d);
				System.out.println(c+" records inserted");
				break;
			}
			case 2:
			{
				dept d=getValues();
				int c=d1.update(d);
				System.out.println(c+" records updated");
				break;
			}
			case 3:
			{
				System.out.println("enter dno");
				int c=d1.deleteOne(sc.nextInt());
				System.out.println(c+" records deleted");
				break;
				
			}
			case 4:
			{
				System.out.println("enter the id");
				
				System.out.println(d1.select(sc.nextInt()));
				break;
			}
			case 5:
			{
				List<dept> l1=d1.selectAll();
				l1.stream().forEach(System.out::println);
				break;
			}
			case 6:
			{
				flag=false;
				break;
			}
			default:
			{
				System.out.println("enter a valid number");
			}
			}
		}

	}

	private static dept getValues() {
		System.out.println("enter dno");
		int dno=sc.nextInt();
		sc.nextLine();
		System.out.println("enter dname");
		String dname=sc.next();
		System.out.println("enter location");
		String location=sc.next();
		return new dept(dno, dname, location);
	}

}
