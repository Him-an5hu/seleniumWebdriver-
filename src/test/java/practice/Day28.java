package practice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day28 {

	private static final Duration Duration = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Assignment
		----------
		https://testautomationpractice.blogspot.com/

		1) provide some string search for it
		2) count number of links
		3) click on each link using for loop
		4) get window ID's for every browser window
		5) close specific browser window
		*/
	/*	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("// input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Testing");
		System.out.println("clicked on search textbox");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		List<WebElement> searchlinks=driver.findElements(By.xpath("// div[@id='wikipedia-search-result-link']"));
		System.out.println(searchlinks.size());
		
		for(WebElement links:searchlinks)
		{
			System.out.println(links.getText());
			links.click();
			
		}
		
		Set<String> Windows=driver.getWindowHandles();
		

		System.out.println("Switching to each browser window and getting the titles........"); 
		for(String winid:Windows)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}
		
		driver.quit();
		
		
	
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
				
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> searchlinks=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		
		System.out.println("Number of Links:"+ searchlinks.size());
		
		System.out.println("printing & clicking links................");
		for(WebElement link:searchlinks)
		{
			System.out.println(link.getText());
			link.click();
		}
		
		//After opening all the pages, capture windowid's
		Set<String> windowIds=driver.getWindowHandles();
		
		System.out.println("Switching to each browser window and getting the titles........"); 
		for(String winid:windowIds)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}
		
		driver.quit();
		
		
	

	}

}
