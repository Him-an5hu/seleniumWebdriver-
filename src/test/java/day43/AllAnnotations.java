package day43;

import org.testng.annotations.*;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AllAnnotations 
{
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before suit");
	}
	@AfterSuite
	void as()
	{
		System.out.println("This is after suit");
	}
	@AfterTest
	void at()
	{
		System.out.println("This is after test");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("This is before test");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("This is before class");
	}
	@AfterClass
	void ac()
	{
		System.out.println("This is after class");
	}
	@BeforeMethod
	void bm()
	{
		System.out.println("This is before method ");
	}
	void am()
	{
		System.out.println("This is after method");
	}
	
	
	
	@Test(priority = 1)
	void Tm1()
	{
		System.out.println("This is method 1 having priority 1 ");
	}
	@Test(priority = 2)
	void Tm2()
	{
		System.out.println("This is method 1 having priority 2 ");
	}

}
