package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics4 {

	@Test
	public void WebloginHomeLoan()
	{
		
		System.out.println("WebLoginHome");
		
	}
	
	@Test
	public void MobileLoginHomeloan()
	{
		System.out.println("MobileLoginHome");
	}
	
	@Test(groups= {"smoke"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("APILoginHome");
	}
	

}
