package testPackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Testa {
	
	
	@BeforeAll
	public static void Beforeall()
	{
		System.out.println("before test a");
	}
	
	
	@Test
	@Tag("tag1")
	 void Testaing()
	{
		System.out.println("running test a");
	}
	
	@AfterAll
	public static void AfterALL()
	{
		System.out.println("after test a");
	}

}
