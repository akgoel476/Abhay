package TestNgPractise;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void Selenium()
	{
		System.out.println("I am Selenium");
	}
	
	@Test(groups= {"smoke"})
	public void Appium()
	{
		System.out.println("I am Appium");
	}


	@AfterTest
	public void Before()
	{
		System.out.println("I will Execute first in Day4");
	}

}
