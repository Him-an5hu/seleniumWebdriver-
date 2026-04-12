package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		
		Actions act = new Actions(driver);
		
		// Minimum slider
		// selecting minimum slide ---0 point 
		WebElement min=driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
		System.out.println("Min location at slider is "+min.getLocation());//(x,y)//(59, 246)
		
		act.dragAndDropBy(min, 100, 246).perform();  //100+59=x , 246 same y
		//check current loaction 
		System.out.println("after slider movement"+min.getLocation());
		
		
		// Maximum slider 
		
		WebElement max=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/span[2]"));
		System.out.println("Maxmium location of slider"+max.getLocation());//(619, 246)
		act.dragAndDropBy(max, -100, 246).perform(); 
		System.out.println("after slider movement"+max.getLocation());
		
		
		

		
		
		
		
		
		

	}

}
