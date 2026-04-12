package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
			
		driver.manage().window().maximize();
		
		WebElement male=driver.findElement(By.xpath("//input[@id='male']")) ;
		
		//select status is selected or not 
		
		System.out.println("status of selecting  male radio button "+male.isSelected());
		
		/// select status after click 
		
		male.click();
		System.out.println("select status after click "+male.isSelected());
		
		
		
	}

}
