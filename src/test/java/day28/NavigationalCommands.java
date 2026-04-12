package day28;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws  MalformedURLException
	{
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		// driver.get("https://demo.nopcommerce.com/");  // accepts URL only in the String format 
		
		// driver.navigate().to("https://demo.nopcommerce.com/");
		
		/*
		URL myurl=new URL("https://demo.nopcommerce.com/");
		driver.navigate().to(myurl); // accept object as well // never use in automation // URL class is of JAVA not selenium 
		*/
		 driver.navigate().to("https://demo.nopcommerce.com/");
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.navigate().back();
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.navigate().forward();
		 System.out.println(driver.getCurrentUrl());
		 
		 driver.navigate().refresh();
		 
		 
		
		
		
		
		

	}

}
