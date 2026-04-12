package day38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

public class CaptureScreenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//1) Capture the full page screenshot 
		
		TakesScreenshot ts=(TakesScreenshot) driver;
	/*	
		File Sourcefile =ts.getScreenshotAs(OutputType.FILE);  // storing the screenshot in file -- somewhere in system
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");	//System.getProperty("user.dir")  --- current user directory basically current project location
		
		Sourcefile.renameTo(targetfile);  // coppy file from source file to targeted location 
	*/	
		// 2) Capture the screenshot of specific section 
	/*	
		WebElement main_part=driver.findElement(By.xpath("//div[@class='main']//div[@class='center clear']"));
		
		File Source_main_part =main_part.getScreenshotAs(OutputType.FILE); // diff? --- taking screenshot from WebElement interface
		File tarFile_main_part=new File(System.getProperty("user.dir")+"\\Screenshots\\main_part.png");
		Source_main_part.renameTo(tarFile_main_part);
		*/
		//3) Capturing the screenshot of specific webelement
		
		WebElement logo=driver.findElement(By.xpath("//img[@data-src='/wp-content/themes/punky/images/logo.png']"));
		
		File source_logo = logo.getScreenshotAs(OutputType.FILE);
		File Targeted_location= new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		source_logo.renameTo(Targeted_location);
		
		
		
		
		
		 
		
		
		
		
		

	}

}
