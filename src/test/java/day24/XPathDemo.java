package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathDemo {

	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		//  driver.get("https://demoqa.com/books");
		
		
		//XPATH HAVING SINGLE ATTRIBUTE 
		
		//driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("Hello world");
		
		//XPATH HAVING MULTIPLE ATTRIBUTE 
		
		//driver.findElement(By.xpath("//input[@id='searchBox'][@placeholder='Type to search']")).sendKeys("HI");
		
		
	//	xpath with 'and'  'or' operators
		
		//driver.findElement(By.xpath("//input[@id='searchBox' and @placeholder='Type to search']")).sendKeys("HI");
		//driver.findElement(By.xpath("//input[@id='searchBox' or @placeholder='Typehh to search']")).sendKeys("Hello");

		//input[@name='search' and @placeholder='Search']
		//input[@name='search' or @placeholder='Search']
		
		// XPATH WITH innerText - Text()
		
		/*
		driver.findElement(By.xpath("//a[text()='Git Pocket Guide']")).click();
		driver.get("https://demoqa.com/elements");
		boolean displayStatus = driver.findElement(By.xpath("//h3[text()='Page']")).isDisplayed(); // //h3[text()='Page'] user to find text
		System.out.println(displayStatus);
		
		String getTextvalue =driver.findElement(By.xpath("//h3[text()='Page']")).getText();  // getText() - use to get text values	
		System.out.println(getTextvalue);
		*/
		
		// XPATH WITH contains()
		
		//input[contains(@placeholder,'Sea')] -- can specify partial value of attribute
		
		driver.get("https://demoqa.com/books");
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Type')]")).sendKeys("OKay report");
		
		// XPATH WITH starts-with()
		
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Type')]")).sendKeys("OKay report");
		
		
		// CHAINED XPATH 
		//https://www.opencart.com/index.php?route=cms/demo
		////div[@class="navbar-header"]/a/img
		
		
		
	
		
	}

}
