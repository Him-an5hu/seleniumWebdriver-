package day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticatedPopup 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//Syntax
		//"https://admin:admin@the-internet.herokuapp.com/basic_aut"  // only for authentication pop-up & there is no other option to do this
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_aut");
		
		
		
	}

}
