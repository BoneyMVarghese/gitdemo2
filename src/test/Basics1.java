package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics1 {
	@AfterTest
	public void last_execution()
	{
		System.out.println("Last execution");
	}
	@Test(groups={"smoke"})
	public void demo2()
	{
		System.out.println("Loan");

	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("This will execute first"); 
	}

}
