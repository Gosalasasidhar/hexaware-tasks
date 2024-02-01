package sasidhar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class demo1 {
	public static void main(String[] args) {

	LocalDate date=LocalDate.now();
	System.out.println(date);
	LocalDate date2=LocalDate.of(2002, 8, 21);
	System.out.println(date2);
	
	String s="2002-08-19";
	LocalDate dt=LocalDate.parse(s);
	System.out.println(s);
	System.out.println(date2.plusYears(21));
	DateTimeFormatter ft=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	System.out.println(LocalDate.parse("21-08-2002", ft));
	}
}
