package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test()
	{
		// Only through assertion we can do validation 
		
		//Assert.assertEquals("xyz","xyz1"); // all kind of the values (int , char, string )
		//Assert.assertEquals("123","345");  // also compare but false
		//Assert.assertEquals("123",123); // 1 string is not equal to number 
		
		//Assert.assertEquals(123,123); // Passed 
		//Assert.assertNotEquals(123, 123); // Failed 
		
		//Assert.assertNotEquals(123, 456); // Passed 
		
		//Assert.assertTrue(true); // Passed
		//Assert.assertTrue(false);//Failed 
		
		//Assert.assertTrue(1==2); // Failed 
		//Assert.assertTrue(1==1); // Failed
		
		// Assert.assertTrue(false); // Failed 
		
		// Assert.assertFalse(1==1); // Failed 
		
		//Assert.fail(); // directly failed my test method
	}

}
