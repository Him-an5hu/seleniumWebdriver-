package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Single file upload 
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		
		driver.manage().window().maximize();
		
		// single file upload 
/*		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\BXJN3260\\OneDrive - orange.com\\Desktop\\Dummy.txt");
		
		if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Dummy.txt"))
		{
			System.out.println("File is successfully uploaded");
		}
		else 
		{
			System.out.println("File is not uploaded");
		}
*/		
		// Multiple file upload 
		
		String file1="C:\\\\Users\\\\BXJN3260\\\\OneDrive - orange.com\\\\Desktop\\\\Dummy.txt";
		String file2= "C:\\\\Users\\\\BXJN3260\\\\OneDrive - orange.com\\\\Desktop\\\\Dummy2.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2); // this is syntax
		
		
		int size_li=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		// validation of count of file 
		
		if(size_li==2)
		{
			System.out.println("Total attachment uploaded");
		}
		else
		{
			System.out.println("all are not there");
		}
		
		
		// validation of files name 
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Dummy.txt") && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Dummy2.txt")) 
		{
			System.out.println("all files name are correct");
		}
		else 
		{
			System.out.println("Files not uploaded");
		}
		

	}

}
