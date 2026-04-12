package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
	
		/*
		driver.findElement(By.xpath("input[name='mytext1']")).sendKeys("TEST"); // Direct xPath not appicatin what kind of error it will give //org.openqa.selenium.NoSuchElementException: Unable to locate element: input[name='mytext1']
		*/
		
		WebElement frame_1=driver.findElement(By.xpath("// frame[@src='frame_1.html']")); // locating frame 
		driver.switchTo().frame(frame_1);// switch to frame one
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame 1 entered"); // perfome action on frame 2 
		driver.switchTo().defaultContent(); // get out from frame
		
		WebElement frame_2 = driver.findElement(By.xpath("// frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame_2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Frame 2 entered");
		driver.switchTo().defaultContent();
		
		WebElement frame_4 = driver.findElement(By.xpath("// frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame_4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Frame 4 entered");
		driver.switchTo().defaultContent();
		
		WebElement frame_3 = driver.findElement(By.xpath("// frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame_3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Frame 3 entered");
		//driver.switchTo().defaultContent();
		
		
		// Inner frame
		// first we are already in side frame3 now we have to move frame which inside frame 3 so there is no elements on inner frame so we will 			switch thourgh index , how many frames in frame3 = only one so index is 0
		
		driver.switchTo().frame(0); // switch to frame3 to inner frame
		
		driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();	
		
		

	}

}
