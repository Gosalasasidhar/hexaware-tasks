package demos;


import java.util.Arrays;

public class streamApipractice {

	public static void main(String[] args) {
		
//		Stream<Number> st=Stream.of(10,20,30.5);
//		int number1[]={0,117,117,36,99,10,118,117,};
//		//Stream<Integer> st2=Arrays.stream(number1);
//		IntStream st2=Arrays.stream(number1);
////		Optional<Number> arr=
//		OptionalInt arr=st2.reduce((a,b)->a*b);
//		if(arr.isPresent())
//		{
//			System.out.println(arr);
//		}
//		else
//		{
//			System.out.println("value is 0");
//		}
//	
		Object[] empArray=new Object[4];
		empArray[0]=(new Employee(1, "sasidhar", 50000));
		for(Object e:empArray)
		{
			System.out.println(e);
			break;
		}
		
		
		
		
	}

	static class Employee
	{
		int id;
		String name;
		long salary;
		public Employee(int id, String name, long salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
	
	
	
	
	}
}	

