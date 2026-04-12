package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day22 {
	
	{
		WebDriver open_browser = new FirefoxDriver();
		open_browser.get("https://www.demoblaze.com/index.html");
		
		// size of links
		List total_links=open_browser.findElements(By.tagName("a"));
		System.out.println(total_links.size()); 
		
		// total images in webside
		List total_images=open_browser.findElements(By.tagName("img"));
		System.out.println(total_images.size()); 
		
		// linktext 
		WebElement click_samsung=open_browser.findElement(By.linkText("Contact"));
		click_samsung.click();
		
	}

}
