package day30;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlearts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		
		
		// 1.Normal alert box with okay button 
		
	/*	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();  // opens the aleart box
		Thread.sleep(5000);
//			Alert my_alert=driver.switchTo().alert();   // Alert interface of selenium 
//			my_alert.accept();
		
		driver.switchTo().alert().accept(); // to Accept the aleart
		
		*/
		// 2.confirmation alert box with okay button & cancel button
	/*	
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); // accept the alreat
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	*/	
		// 3. Prompt alert
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click(); // open alerts
		Thread.sleep(5000);
		
		Alert myalert=driver.switchTo().alert();
		System.out.println("Text msg on alert : "+myalert.getText());
		myalert.sendKeys("Hello");	
		myalert.accept();
		
		
		
		
		

	}

}
