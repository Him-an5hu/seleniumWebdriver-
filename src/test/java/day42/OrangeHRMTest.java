package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/*
 * 1. Open application 
 * 2. Test logo presence 
 * 3. Login 
 * 4. Close
 */

public class OrangeHRMTest 
{	
	WebDriver driver;

	@Test(priority = 1)
	void openapp()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority  = 2)
	void testlogo() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean logo =driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Display statys  =  "+logo);
	}
	
	@Test(priority = 3)
	void login()
	{
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
		
	@Test(priority = 4)
	void close()
	{
		driver.close();
	}
	
	
	
	
}
