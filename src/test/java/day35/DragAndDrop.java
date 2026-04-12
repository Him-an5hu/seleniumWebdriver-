package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		 WebElement pickit=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		 
		 WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		 
		 Actions act = new Actions(driver);
		 
		 act.dragAndDrop(pickit, drop).build().perform();
		
		
		
		//p[normalize-space()='Drag me to my target']
	
		
		
	}

}
