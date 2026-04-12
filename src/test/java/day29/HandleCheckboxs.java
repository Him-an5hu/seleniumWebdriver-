package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleCheckboxs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement checkbox =driver.findElement(By.xpath("//input[@id='sunday']"));
		
		// 1.select the checkbox
		
		System.out.println("checkbox before click = "+checkbox.isSelected());
		//driver.findElement(By.xpath("//input[@id='sunday']")).click(); // To check and uncheck
		System.out.println("checkbox after click = "+checkbox.isSelected());
		
		//2.How many checkbox in page 
		
		List<WebElement> multiple_checkboxes =driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("count no. check box"+ multiple_checkboxes.size());
		
		//3.select all the check box
		
	/*	for (int i=0;i< multiple_checkboxes.size();i++)
		{
			multiple_checkboxes.get(i).click();
		}
		*/
		
		// using enhanced for loop 
		
		/*for(WebElement chkbox:multiple_checkboxes)
		{
			chkbox.click();
		}
		*/
		
		//4.select last 3 checkboxes
		//total number of checkboxes - how many checkbox you want to select = starting_index
		//7-3=4
		/*
		for(int i=multiple_checkboxes.size()-3;i<multiple_checkboxes.size();i++)
		{
				multiple_checkboxes.get(i).click();
		}
		*/
		
		//5.first three checkboxes
		
		/*for(int i=0;i<3;i++)
		{
				multiple_checkboxes.get(i).click();
		}
		*/
		
		
		//6.select or unselect box vise versa
		
		/* 	for(WebElement chkbox:multiple_checkboxes)
		 	{
		 		if(chkbox.isSelected())
		 		{
		 			chkbox.click(); //unselect 
		 		}
		 		else
		 		{
		 			chkbox.click();// select
		 		}
		 		
		 	}
		 	
		 	Thread.sleep(5000);
		 	
		 	for(WebElement chkbox:multiple_checkboxes)
		 	{
		 		if(chkbox.isSelected())
		 		{
		 			chkbox.click(); //select 
		 		}
		 		else
		 		{
		 			chkbox.click();// unselect
		 		}
		 		
		 	}
		*/
		 	// 7.for multiple or random please write specific xpath 
		 	/*
		 	for(int i=0;i<multiple_checkboxes.size();i++)
		 	{
		 		if(i==1 || i==3 || i==6)
		 		{
		 			multiple_checkboxes.get(i).click();
		 		}
		 	}
		 	*/
		
		
		 	// 8. On basis of label checkbox clicking
		 	
		 	String weekname="Tuesday";
		 	
		 	switch (weekname) {
		 	
		 		case "Sunday" : driver.findElement(By.xpath("//label[normalize-space()='Sunday']")).click();
		 						break;
		 						
		 		case "Monday" : driver.findElement(By.xpath("//label[normalize-space()='Monday']")).click();
					break;
					
		 		case "Tuesday" : driver.findElement(By.xpath("//label[normalize-space()='Tuesday']")).click();
					break;
		 		case "Wednesday" : driver.findElement(By.xpath("//label[normalize-space()='Wednesday']")).click();
					break;
					
		 		case "Friday" : driver.findElement(By.xpath("//label[normalize-space()='Sunday']")).click();
					break;
		 		case "Saturday" : driver.findElement(By.xpath("//label[normalize-space()='Sunday']")).click();
					break;
					
		 		
					

			default:System.out.println("Not fount the correct weekname");
				break;
			}

		
		

	}

}
