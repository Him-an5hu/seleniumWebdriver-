package day41;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTestingPractice 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();

		
		String filePath1=System.getProperty("user.dir")+"\\Testdata\\caldata2.xlsx";
		
		
		int total_rows=ExcelUtils.getRowCount(filePath1,"Sheet1");
		
		for(int r=1;r<=total_rows;r++)
		{
			WebElement rateField = driver.findElement(By.id("mat-input-2"));
			// 1)Reading data from file 
			String Int_dep=ExcelUtils.getCellData(filePath1, "Sheet1", r, 0);
			String Intrest_rate=ExcelUtils.getCellData(filePath1, "Sheet1", r, 1);
			String length_month=ExcelUtils.getCellData(filePath1, "Sheet1", r, 2);
			
			String compounding=ExcelUtils.getCellData(filePath1, "Sheet1", r, 3);
			String Total=ExcelUtils.getCellData(filePath1, "Sheet1", r, 4); //expected total , will be compared with actual total
			
			
			//2) pass above data into application
			//first clear all 
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).clear();
			Thread.sleep(3000);
			
			
			
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(Int_dep);
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(length_month);
			Thread.sleep(3000);
			rateField.sendKeys(Intrest_rate);
			//driver.findElement(By.id("mat-input-2")).sendKeys(Intrest_rate);
			//driver.findElement(By.xpath("//input[@formcontrolname='cdRate']")).sendKeys(Intrest_rate);
			
			// Click dropdown
			WebElement compoundrp = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));
			compoundrp.click();

			// Re-locate elements dynamically + break after click
			List<WebElement> options = driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));

			for (int i = 0; i < options.size(); i++) 
			{
			    List<WebElement> freshOptions = driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));
			    
			    if (freshOptions.get(i).getText().equals(compounding)) 
			    {
			        freshOptions.get(i).click();
			        break; // 🔴 VERY IMPORTANT (prevents stale error)
			    }
			}
			
			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")).click();///click on button to calculate cd calculation based on xl cell data

			
			
			//validation
			String actual_total = driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			
			System.out.println("act total is: " + actual_total);
			System.out.println("exp total is: " + Total);
			
			if(actual_total.equals(Total)) //if expected total = actual total then	
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath1, "Sheet1",r, 6,"Passed");
				ExcelUtils.fillGreenColor(filePath1, "Sheet1",r,6);
			}
			else 
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath1, "Sheet1",r, 6,"Failed");
				ExcelUtils.fillGreenColor(filePath1, "Sheet1",r,6);				
			}
			Thread.sleep(3000);
			
			
		}
		System.out.println("calculation has been completed");
		driver.quit();
	}

}
