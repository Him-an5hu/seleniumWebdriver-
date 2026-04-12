package day34;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDemo1 {
	
	
	static void SelectfurtureDate(WebDriver driver,String Year, String Month, String Date)
	{
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		// pick the current values for the comparison with expected values
		while(true)
		{
			 String Current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 String Current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 
			 if(Current_year.equals(Year) && Current_month.equals(Month))
			 {
				 break;
			 }
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		// extracting all current dates for the comparison with expected & printing the same 
		
		List<WebElement> Current_Dates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td//a"));
		
		for(WebElement dt:Current_Dates)
		{
			if(dt.getText().equals(Date))
			{
				dt.click();
				break;
			}
		}
	}
	
	static void SelectPastDate(WebDriver driver,String Year, String Month, String Date)
	{
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		// pick the current values for the comparison with expected values
		while(true)
		{
			 String Current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			 String Current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			 
			 if(Current_year.equals(Year) && Current_month.equals(Month))
			 {
				 break;
			 }
			
			 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		// extracting all current dates for the comparison with expected & printing the same 
		
		List<WebElement> Current_Dates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td//a"));
		
		for(WebElement dt:Current_Dates)
		{
			if(dt.getText().equals(Date))
			{
				dt.click();
				break;
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		// Selecting sendkeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/27/2026");
		
		
		// make the variable for the expected ressult 
		
		String Year ="2024";
		String Month ="December";
		String Date  ="26";
		
		//SelectfurtureDate(driver, Year, Month, Date);
		SelectPastDate(driver, Year, Month, Date);	

	}

}
