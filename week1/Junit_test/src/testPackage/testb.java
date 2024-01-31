package testPackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class testb {
	
	
	@BeforeAll
	public void Beforeall()
	{
		System.out.println("before test b");
	}
	
	
	@Test
	public void Testa()
	{
		System.out.println("running test b");
	}
	
	@AfterAll
	public void AfterALL()
	{
		System.out.println("after test b");
	}


}
