package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
				
		WebElement Field_1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement Field_2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement Copy_text = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		//clear with field 1 text
		Field_1.clear();
		Field_1.sendKeys("Welcome");
		
		Actions act= new Actions(driver);
		
		act.doubleClick(Copy_text).build().perform();
		
		String text = Field_1.getAttribute("value");
		
		// Validtion feild 1 and feild 2 
		
		if(text.equals("Welcome"))   // why not get text please read the notes 
		{
			System.out.println("copied text matched");
		}
	
		else 
		{
			System.out.println("copied text not matched");
		}
		
		
		

		//input[@id='field1']
		//input[@id='field2']
		//button[normalize-space()='Copy Text']

	}

}
