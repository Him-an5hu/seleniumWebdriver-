package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		// tag id 		tag#id 
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		// another way - tagname is optional
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");   
		
		
		// tag class 	tag.class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("hello");
		// another way 
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("hello");
		
		
		//tag attributes	tag.[attributes="value"]
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("click krle bhai");
		//driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("click krle bhai");
		
		//tag class attributes   tag.class[attributes="values"]
		
		//driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("nhi bharna ja");
		//driver.findElement(By.cssSelector(".search-box-text[name=\"q\"]")).sendKeys("nhi bharna ja");
		
		
		
		
	}

}
