package day43;

import org.apache.logging.log4j.core.net.Priority;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
TC1
----
1) Login -- @BeforeMethod
2) Search --->  @Test
3) Logout  ---@AfterMethod
4) Login
5) Adv search  ---@Test
6) Logout

*/

public class AnnotationDemo1 
{
	@BeforeMethod
	void login()
	{
		System.out.println("This is login");
	}
	
	@Test(priority = 1)
	void search()
	{
		System.out.println("This is search ");
		
	}
	
	@Test(priority = 2)
	void advsearch()
	{
		System.out.println("This is advsearch ");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout ");
	}
	
	
	
	
}
