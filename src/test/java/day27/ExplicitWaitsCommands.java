package day27;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitsCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		WebDriver driver= new FirefoxDriver();
		// Explicit wait declaration 
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		// Usage of exlicit waits
		WebElement Username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		Username.sendKeys("Admin");
		
		WebElement Password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		Password.sendKeys("admin123");
		
		WebElement Login=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
		Login.click();

	}

}
