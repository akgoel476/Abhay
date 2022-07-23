package TestNgPractise;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@Test(groups= {"smoke"})
	public void Demo()
	{
		System.out.println("Hello");
	}
	
	@Parameters({"URL"})
	@Test
	public void SecondClass(String urlname)
	{
		System.out.println(urlname);
	}
	
	@Test
	public void Don()
	{
		System.out.println("I am Don");
	}
	
	@AfterTest
	public void Before()
	{
		System.out.println("I will Execute first in Day1");
	}

}
