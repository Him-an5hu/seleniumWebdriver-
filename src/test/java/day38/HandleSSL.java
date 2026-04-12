package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandleSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxOptions options=new FirefoxOptions();
		options.setAcceptInsecureCerts(true); // Accepts SSL certificates 
		
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://expired.badssl.com/");
		
		System.out.println("Title of the page :"+ driver.getTitle());
		

	}

}
