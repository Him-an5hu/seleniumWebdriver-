package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
		
		
		
		WebElement drpdownEle=driver.findElement(By.xpath("// select[@id=\"country\"]"));
		Select drpdowncountry = new Select(drpdownEle);
		
		// Selecting option from dropdown 
		//drpdowncountry.selectByVisibleText("United Kingdom");
		//drpdowncountry.selectByValue("uk");
		drpdowncountry.selectByIndex(3);
		
		// Capturing all the options from dropdwon 
		
		List<WebElement> options=drpdowncountry.getOptions();  // capture all options 
		System.out.println("All Options on console printed =  " +options.size()); // print the list of size 
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//from enhanced for loop 
		/*
		for(WebElement optvalues:options)
		{
			System.out.println(optvalues.getText());
		}
		*/
		
	}

}
