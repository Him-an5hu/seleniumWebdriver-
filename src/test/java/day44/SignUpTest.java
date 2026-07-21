package day44;

import org.testng.annotations.Test;

public class SignUpTest {

	@Test(priority = 1, groups= {"regression"})
	void signUpbyemail()
	{
		System.out.println("sign up by email");
	}
	
	@Test(priority = 2, groups= {"regression"})
	void signUpbyFacebook()
	{
		System.out.println("sign up by facebook");
	}
	
	@Test(priority = 3, groups= {"regression"})
	void signUpbyTwitter()
	{
		System.out.println("sign up by twitter");
	}
}
