package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day29 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://practice.expandtesting.com/radio-buttons");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='yellow']")).click();
		System.out.println("Yellow button clicked ");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='football']")).click();
		System.out.println("football button clicked");

	}

}
