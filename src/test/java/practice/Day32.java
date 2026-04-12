package practice;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Strings;

public class Day32 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		
		WebElement dep_city=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select dep_city_options = new Select(dep_city);
		
		dep_city_options.selectByValue("Boston");
		
		WebElement des_city=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select des_city_options = new Select(des_city);
		
		des_city_options.selectByValue("Buenos Aires");
		
		driver.findElement(By.xpath("// input[@value='Find Flights']")).click();
		
		// Select the price from table 
		
		String pricesArr[]=new String[5]; // 5 number of rows i already know 
		
		for(int r=1;r<=5;r++)
		{
			String Price_Data=driver.findElement(By.xpath("// table[@class='table']//tr["+r+"]//td[6]")).getText();
			System.out.println(Price_Data);
			
			pricesArr[r-1]=Price_Data; // sending each element to Prices arr
			
		}
		// checking pricesArr[] values inserted 
		for(String arrvalue:pricesArr)
		{
			System.out.println(arrvalue); // pring pricesarr
		}
		
		Arrays.sort(pricesArr); // this will able to sort strings. so no need to convert to number
		String lowestPrice=pricesArr[0];
		System.out.println("Lower price:"+lowestPrice); // first price will be lowest price 
		
		for(int r=1;r<=5;r++)
		{
			String Price_Data_click=driver.findElement(By.xpath("// table[@class='table']//tr["+r+"]//td[6]")).getText();
			if (Price_Data_click.equals("$200.98"))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
				break;

			}
		}
		
		String confirmation=driver.findElement(By.xpath("//div[@class='container']//h2")).getText();
		if(confirmation.equals("Your flight from TLV to SFO has been reserved."))
		{
			System.out.println("Script success");
		}
		else
		{
			System.out.println("Failed");
		}
		

	
				

	}

}
