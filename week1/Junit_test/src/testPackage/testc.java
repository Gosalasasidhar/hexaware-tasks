package testPackage;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class testc {
	@BeforeAll
	public void Beforeall()
	{
		System.out.println("before test c");
	}
	
	
	@Test
	public void Testa()
	{
		System.out.println("running test c");
	}
	
	@AfterAll
	public void AfterALL()
	{
		System.out.println("after test c");
	}


}
