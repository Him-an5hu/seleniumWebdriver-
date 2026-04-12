package day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.Condition;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		WebDriver driver= new FirefoxDriver();
		
		//declaration 
		
		Wait<WebDriver> my_wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);
		
		
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		// Usage of  waits
		
		 WebElement TxtUser = my_wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("//input[@placeholder='Username']"));
		     }
		   });
		 
		 TxtUser.sendKeys("Admin");
		

	}

}
