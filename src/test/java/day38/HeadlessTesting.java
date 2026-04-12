package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxCommandContext;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/*
 * Test Case 
 * -----------------
 * 
 * 1.Launch broswer (Chrome)
 * 2.open url https://demo.opencart.com/
 * 3.validate title should be your store
 * 4.close browser 
 * 
 */
public class HeadlessTesting 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		
		
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");    /// for chrome options.addArguments("--headless=new"); 
		
		// 1.Launch broswer (Chrome)
		//FirefoxDriver driver = new FirefoxDriver();
		// 2nd type 
		WebDriver driver= new FirefoxDriver(options);
		
		
		// 2.open url https://demo.opencart.com/
		
		driver.get("https://www.youtube.com/");
		
		//3.validate title should be your store
		
		String act_title =driver.getTitle();
		
		if(act_title.equals("YouTube"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	
		//4.close browser 
		
		driver.close();
		//driver.quit();
		
		
		

	}

}
