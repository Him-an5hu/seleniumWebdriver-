package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserstionsDemo {

	@Test
	void testTitle() // sytax test method should start with test_then functional 
	{
		String exp_title="OpenCart";
		String act_title="OpenCarttttt";
		/*
		if(exp_title.equals(act_title))
		{
			System.out.println("Test passed ");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		*/
		
		// Assert.assertEquals(exp_title, act_title);
		
		
		if(exp_title.equals(act_title))
		{
			System.out.println("Test passed ");
			Assert.assertTrue(true);
		}
		else 
		{
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
		
		
	}
}
