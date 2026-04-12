package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();

		
		// get() - Open url on browser 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		
		// getTitle() - Get title of web page 
		System.out.println(driver.getTitle());  //OrangeHRM
		
		// getcurrenturl() -- Get current url of Webpage 
		System.out.println(driver.getCurrentUrl());
		
		// getPageSource -- return the source code of the page 
		//System.out.println(driver.getPageSource());  // to validate some field in UI if is there or not
		
		// getWindowHandle -- return the ID of the single browser window
		//String windowID = driver.getWindowHandle();
		//System.out.println(windowID);  // 7b129452-756a-4e00-be8b-8871bac41ae0
		
		// getWindowHandle -- return the ID's of the Multiple browser window
				driver.findElement(By.linkText("OrangeHRM, Inc")).click();
				Set<String> WindowTabIDs=driver.getWindowHandles();// why set is used because this collection do not hold the duplicates
				System.out.println(WindowTabIDs);// [74502584-67e4-4672-bcd9-aab11643fb02, 596f8816-4d7a-40ac-8a21-12103572f3a0]
				
		// user of getwindowHandle & getWindowHandles -- to perfom action on specifc broswer tab we use Window ID
				
				
	}

}
