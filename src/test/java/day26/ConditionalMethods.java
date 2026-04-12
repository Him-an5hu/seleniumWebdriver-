package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		
		//  isDisplayed() - we can check display status of the element
		WebElement Logo_check =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of lOGo "+Logo_check.isDisplayed());
		
		// isEnabled() - we can check enable/disable status of the element/operational element
		
		boolean Enable_status = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println("Enable status of input textbox : "+Enable_status);
		
		
		// isSelected() - we can use to check the element is selected or not
		WebElement male =driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female =driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("before selection ");
		System.out.println(male.isSelected());
	
		System.out.println(female.isSelected());
		
		System.out.println("After selection ");
		male.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		
		
		
		

	}

}
