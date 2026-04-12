package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleHiddenDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		driver.manage().window().maximize();
		
		//Login steps
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//clicking on PIM 
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click(); //PIM
	
		// CLICKED ON DROPDOWN
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
		
		// SELECTING  SINGLE OPTION 
		
		//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		
		// capuring all the options 
		List<WebElement> alloptions=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("size of options   "+alloptions.size());
		
		
//List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
	//	System.out.println("Number of options:"+ options.size()); //29
		// printing all the opiton
		
		for(WebElement allops : alloptions)
		{
			System.out.println(allops.getText());
		}
		
		
	}

}
