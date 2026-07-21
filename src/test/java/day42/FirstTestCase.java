package day42;

import org.testng.annotations.Test;

/*
 * Open applicaton 
 * Login application 
 * Logout application 

 * 
 */


public class FirstTestCase 
{
	@Test(priority = -300)
	void Logout()
	{
		System.out.println("Logout application");
	}
	
	
	@Test(priority = 90)
	void openapp()
	{
		System.out.println("Opening Application");
	}
	@Test
	void Login()
	{
		System.out.println("Login application");
	}
	
}
