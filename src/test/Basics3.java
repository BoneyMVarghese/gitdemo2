package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics3 {
@BeforeClass
public void beforeclass()
{
	System.out.println("Before every class");
}

@AfterClass
public void afterclass()
{
	System.out.println("After every class");
}
	@Parameters({"URL"})
	@Test 
	public void WebloginCarLoan(String urlname)
	{
		
		System.out.println("WebLoginCar");
		System.out.println(urlname);
	}
	
	@Test(dependsOnMethods= {"WebloginCarLoan"})
	public void MobileLoginCarloan()
	{
		System.out.println("MobileLoginCar");
	}
	
	@Test
	public void MobileSignIn()
	{
		System.out.println("MobileSignIn");
	}
	
	@Test
	public void MobileSignOut()
	{
		System.out.println("MobileSignOut");
	}
	@Test
	public void LoginAPIcarLoan()
	{
		System.out.println("APILoginCar");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("Print this before suite");
	}
	
	@AfterSuite
	public void AftSuite()
	{
		System.out.println("Print this After suite");
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("Execute before every test method");
	}
	
	@AfterMethod()
	public void afterevery()
	{
		System.out.println("Execute before every test method");
	}
	
}
