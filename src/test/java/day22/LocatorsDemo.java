package day22;

import java.lang.module.FindException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://demoqa.com/books");
		
		//driver.get("https://www.udemy.com/");
		
	
		//
		 // By name
		//WebElement search=driver.findElement(By.name("search_query"));  // locating web element and storing in variable
		
		// send input in test box user sendKeys 
		
		//search.sendKeys("Macbook");
		
		// Another way 
		//driver.findElement(By.name("search_query")).sendKeys("macbook");
		
		
		// By ID
		
		/*
		WebElement id =driver.findElement(By.id("navbar-collapse-header"));
		boolean status=id.isDisplayed();
		System.out.println("Logo display check "+status);
		*/
		// another way to write 
		
		/*
		boolean status=driver.findElement(By.id("navbar-collapse-header")).isDisplayed();
		System.out.println("Logo display check "+status);
		driver.close();
		*/
		
		//linkText & PartialText -- only for link  
		
		//driver.findElement(By.linkText("Designing Evolvable Web APIs with ASP.NET")).click(); link text
		//driver.findElement(By.partialLinkText("Designing Evolvable ")).click(); partial link test 
		
		
		// classname 
		
		/*
		driver.get("https://demoqa.com/alerts");
		List headerLink=driver.findElements(By.className("btn"));  // findelements return group of validation 
		System.out.println(headerLink.size()); // 37   
		*/
		
		// Tagname 
		
		// Question - trying to capture all the links from page using tagname 
	/*	
		driver.get("https://demoqa.com/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		*/
		
		// Question - total no. of image in web site 
		
	/*	List images =driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		*
		*/
		
		
		// findElement() vs findElements()
		
		driver.get("https://demoqa.com/");
		//WebElement ele = driver.findElement(By.id("xyz"));
		
		List<WebElement> list_ele = driver.findElements(By.id("xyz"));
		System.out.println(list_ele.size());
		
		
		
		
		 
		
		
		
		
		

	}

}
