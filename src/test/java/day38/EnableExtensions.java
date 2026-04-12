package day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class EnableExtensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxOptions options=new FirefoxOptions();
	
	
		File file=new File("C:\\Automation\\automationFiles\\crx files\\SelectorsHub.crx");
		
	//	options.addExtensions(file);  // only to remove error from the project 
	
	
		WebDriver driver=new FirefoxDriver(options);;
	
		
		driver.get("https://www.youtube.com/");
		
		String act_title =driver.getTitle(); 
		
		if(act_title.equals("YouTube"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	
		
		driver.close();
		

	}

}
