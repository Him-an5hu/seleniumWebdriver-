package practice;

import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day33_Pagination_Table {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		//Pagination Web Table
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Showing 1 to max
		
		for(int p=1; p<=4 ;p++)
		{
			if(p>1)
			{
				driver.findElement(By.xpath("//a[normalize-space()="+p+"]")).click();
				Thread.sleep(Duration.ofSeconds(3));
			}
			
			
			for(int r=0;r<=5;r++)
			{
				for(int c=1;c<=3;c++)
				{
					String all_values=driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r+"]//td["+c+"]")).getText();
					System.out.print(all_values+"\t");
					
				}
				System.out.println();
				driver.findElement(By.xpath("// table[@id=\"productTable\"]//tr["+r+"]//td[4]//input")).click();
			}
			
			
			
		}

	}

}
