package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticTable 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1) Total number of rows 
		int row_size=driver.findElements(By.xpath("// table[@name='BookTable']//tr")).size(); // Total size
		System.out.println("Number rows in book tabe "+row_size);
		
		int rows_size=driver.findElements(By.tagName("tr")).size(); /// total number of rows in webpage 
		System.out.println("Number of rows of all table in webpage "+ rows_size);
		
		
		//2) Total number of columns 
		int columns= driver.findElements(By.xpath("// table[@name='BookTable']//tr//th")).size();
		System.out.println("Number columns in book tabe "+columns);
		
		int columns_size=driver.findElements(By.tagName("th")).size(); /// total number of rows in webpage 
		System.out.println("Number of columns of all table in webpage "+ columns_size); 
		
		//3) Total read from specific row and column 
		
			String specific_value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[1]")).getText();
			System.out.println(specific_value);
		
			
		//4) Total number of rows & column 
	/*	System.out.println("BookName"+"\t"+"\t"+"Author"+"\t"+"\t"+"Subject"+"\t"+"\t"+"Price"+"\t");
		for(int r=2;r<=row_size;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				 String all_values=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				 System.out.print(all_values+"\t"+"\t");
			}
			System.out.println();
	
		}
		*/
		// 5) print book name who written by authername = Mukesh
			
		/*	for(int r=2;r<=row_size;r++)
			{
				String Author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
				if(Author.equals("Mukesh"))
				{
					String Booknames_auth=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
					System.out.print(Booknames_auth+"\t");
				}
			}
			*/
			//6) Find total price of all the books
			
			int total=0;
			for(int r=2;r<=row_size;r++)
			{
				String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				total=total+Integer.parseInt(price);
				
			}
			
			System.out.println("Total Price of the books:"+total); //7100

		}

		
		
}
