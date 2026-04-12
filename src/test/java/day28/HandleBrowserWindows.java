package day28;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.sdk.metrics.internal.state.ArrayBasedStack;

public class HandleBrowserWindows {

	private static final String[] WindowIDs = null;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // always after driver object
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		
		// approach 1.
		
		List<String> windowList = new ArrayList(windowIDs);
		/*
		String parentID= windowList.get(0);
		String childID= windowList.get(1);
		
	//	System.out.println(driver.getTitle());  /// to show broswer is always focus on parent window.OrangeHRM
		
		// Switch to child window 
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		*/
		
		// Approch 2. 
		
		
		for(String winId:windowIDs)
		{
			String title=driver.switchTo().window(winId).getTitle();
			
			if(title .equals("OrangeHRM"))// title of tab  in which action want to perfoem
			{
				System.out.println(driver.getCurrentUrl());
			}
			
			
		}
		
		
		
		
		
		

		
	}

}
