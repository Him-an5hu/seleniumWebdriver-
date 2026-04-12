package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class RunInIncoginitoMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		FirefoxOptions options=new FirefoxOptions();

		//options.addArguments("--incognito");// chrome
		// options.addArguments("-private");
		options.addPreference("browser.privatebrowsing.autostart", true);
		
	
		WebDriver driver= new FirefoxDriver(options);
		
		
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
