package TestNgPractise;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(groups= {"smoke"})
	public void logout()
	{
		System.out.println("logout");
	}

}
