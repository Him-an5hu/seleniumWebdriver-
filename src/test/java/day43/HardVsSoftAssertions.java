package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

/*	@Test
	void  test_hardasserstions()
	{
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		// Assert.assertEquals(1,1); all will be printed when passed 
		Assert.assertEquals(1,2); 
		//Testing....
		//Testing....
		//FAILED: day43.HardVsSoftAssertions.test_hardasserstions
		
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		/// Always use hard assertion in last 
	}
	*/
	@Test
	void  test_softasserstions()
	{
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		SoftAssert sa = new SoftAssert();  // diff create object have name of the method 
		sa.assertEquals(1, 2); // soft asserstion  ---output PASSED: day43.HardVsSoftAssertions.test_softasserstions all testing 
		 
		
		
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		sa.assertAll(); // mandatory in soft assertion ---this should be used in last rember all - now ---> FAILED: day43.HardVsSoftAssertions.test_softasserstions
		
		/// Always use hard assertion in last 
	}
	
}
