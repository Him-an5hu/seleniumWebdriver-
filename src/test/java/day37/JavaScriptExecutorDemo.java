package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
	//	FirefoxDriver driver = new FirefoxDriver();  
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Hello Bhai");
		
		// above same task need perform from javascriptexecutor 
		
		WebElement input_box=driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//			or
		//JavascriptExecutor js = driver;
		
		
		
		// Pasing text into input box - alternate of sendkeys()
		js.executeScript("arguments[0].setAttribute('value','Himanshu')", input_box);
		
		
		
		// clicking on element - alternate of click()
		
		WebElement myclick = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", myclick);
		
		
		
	}

}	
