package day35;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		WebElement Demo_sites=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Demo Sites')]"));
		WebElement X_path_axes =driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='XPath Demo Page']"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(Demo_sites).moveToElement(X_path_axes).click().build().perform();
		
		//act.moveToElement(Demo_sites).moveToElement(X_path_axes).click().perform();
		
		
		
	}

}
