package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Day30 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	/*	
	 * Q) click on login then handle alert : https://mypage.rediff.com/login/dologin
	 */
		
		
	// Alert practice	
/*		driver.get("https://mypage.rediff.com/login/dologin");
		
		driver.findElement(By.xpath("//input[@id='txtlogin']")).sendKeys("Hello Bhai alert check");
		//	System.out.println("textbox found");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(2000);
		
		Alert myalert=driver.switchTo().alert();
		myalert.accept();
		System.out.println("Accepted");
		
	*/	
		
		
		/*
		 * 
			1) https://ui.vision/demo/webtest/frames/
			2) switch to  5th frame
			3) click on link  - opens new iframe
			4) switch to inner frame 
			5)  check logo presence in the inner frame.

		 * 
		 */
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame5=driver.findElement(By.xpath("// frame[@src=\"frame_5.html\"]"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
	
		
		driver.switchTo().frame(0); // inside the frame
		
		Thread.sleep(1000);
		WebElement Logo=driver.findElement(By.xpath("//a[@id='logo']")); // not able to print the expected result 
		Logo.isDisplayed();
		
		
		
		
	}

}
