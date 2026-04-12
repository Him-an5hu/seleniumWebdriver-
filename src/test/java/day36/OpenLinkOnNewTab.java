package day36;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkOnNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement link=driver.findElement(By.xpath("//a[normalize-space()='Udemy Courses']"));
		
		Actions act = new Actions(driver);
		// Crtl + click 
		act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();  
		// two click are there one is from Actions class and another is from Click
		
		// switch to next tab 
		
		Set<String> set_collection =driver.getWindowHandles(); // getWindowHandle return set collection
		
		List<String> id= new ArrayList(set_collection); // we want on the basis on of index so we converted it to List
		
		// Switching to 1 index tab 
		driver.switchTo().window(id.get(1)); //switch to registration page
		driver.findElement(By.xpath("//div[@id='PageList1']//a[normalize-space()='Udemy Courses']")).click();
		
		
		
		

	}

}
