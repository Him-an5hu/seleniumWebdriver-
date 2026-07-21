package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethod {
	
	@Test(priority = 1)
	void openapp()
	{
		Assert.assertTrue(true); // dependency method ---> this is dependency method ---> But in testNG if it failed , testNG keep executing rest of the methods 
	}
	@Test(priority = 2 , dependsOnMethods = {"openapp"})
	void  login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3 , dependsOnMethods = {"login"})
	void search()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority = 4, dependsOnMethods = {"login","search"})
	void advsearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority = 5, dependsOnMethods = {"advsearch"})
	void logourt()
	{
		Assert.assertTrue(true);
	}

}
