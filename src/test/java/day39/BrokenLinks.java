package day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//1) Link    href="https://xyz.com"
		//
		//2) https://xyz.com ---> server ---> status code
		//
		//3)  status code>=400   broken link
		// status code <400   not a broken link
		
		
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		
		// capture all the links from website 
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links = "+ links.size());
		
		int brokenlink = 0;
		
		for(WebElement linkElements:links)
		{
			String hrefattValue=linkElements.getAttribute("href");
			
			if(hrefattValue==null || hrefattValue.isEmpty())
			{
				System.out.println("href attribute has some empty or null not posssible to validate");
				continue;  // continue no need of else 
			}
			
			// hit the url to the server 
			URL linkURL = new URL(hrefattValue);
//			URL linkURL = new URL(hrefattValue);//converted href  value from String to URL format
			HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();// opemn the connection to the server /// java class
			conn.connect();// connect to the server and sent the request to the servere 
			
			
			try {
				
				
				if(conn.getResponseCode()>400)
				{
					System.out.println("Broken link = "+hrefattValue);
					brokenlink++;
				}
				else 
				{
					System.out.println("Not Broken link = "+hrefattValue);
				}
			
			}
			catch(Exception e)
			{		
			}
			
			
			
		}
		System.out.println("Number of broken links "+brokenlink);
		

	}

}
