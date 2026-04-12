package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// 1)Scrolling down page by pixel number
	/*	
		js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));  //1500
		*/
		// 2)Scrolling down page till element is visible 
		
		/*
		WebElement element =driver.findElement(By.xpath("//td[normalize-space()='Benin']"));
		
		js.executeScript("arguments[0].scrollIntoView();",element);
		System.out.println(js.executeScript("return window.pageYOffset;"));  //
			*/
		
		// 3) Scroll down till bottom of the page 
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));  // 9568.7998046875
		
		Thread.sleep(2000);
		
		//Scrolling up to intial postion 
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		
		
		
		
		

	}

}
