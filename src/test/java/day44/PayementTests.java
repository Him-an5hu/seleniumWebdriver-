package day44;

import org.testng.annotations.Test;

public class PayementTests {
	
	@Test(priority =1, groups= {"regression","sanity","functional"})
	void paymentinRuppes()
	{
		System.out.println("Payment in rupees");
	}
	
	@Test(priority =2, groups= {"regression","sanity","functional"})
	void paymentinDollars()
	{
		System.out.println("Payment in Dollar");
	}

}
