package day44;

import org.testng.annotations.Test;

public class LoginTests {
	
	@Test(priority = 1 , groups= {"sanity"})
	void loginbyEmail()
	{
		System.out.println("Login by email");
	}
	
	@Test(priority = 2, groups= {"sanity"})
	void loginbyFacebook()
	{
		System.out.println("Login by facebook");
	}
	
	@Test(priority = 3, groups= {"sanity"})
	void loginBytwitter()
	{
		System.out.println("This is login by twitter");
	}

}
