package day37;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("document.body.style.zoom='200%'");
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='20%'");
		Thread.sleep(4000); 

	}

}
